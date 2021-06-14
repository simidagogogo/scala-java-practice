# coding=utf8
from __future__ import print_function

import sys
from pyspark import SparkContext, SparkConf

reload(sys)
sys.setdefaultencoding('utf-8')

import jieba


def fl(x):
    return x.strip().split(' ')


def fenci_func(x):
    # for x, w in jieba.analyse.extract_tags(x, withWeight=True):
    # return (x, float(w))
    word_list = jieba.cut(x.strip())
    ls = []
    ls.append(x.strip())
    for word in word_list:
        if len(word) > 1:
            ls.append(word)
    return ls


if __name__ == "__main__":
    # conf = SparkConf().setMaster("local[2]").setAppName("wordseg_jieba_cluster")
    conf = SparkConf()\
        .setMaster("spark://master:7077")\
        .setAppName("wordseg_jieba_cluster")
    sc = SparkContext(conf=conf)

    in_file = sc.textFile("/music_meta.txt.small")
    resultRdd = in_file \
        .map(lambda x: x.strip().split('	')) \
        .map(lambda x: x[1].strip()) \
        .map(fenci_func) \
        .map(lambda x: '	'.join(x)) \
        .saveAsTextFile("/pyspark_wordseg_output_1")

    # for x in resultRdd.collect():
    # print(x)

    # resultRdd = in_file\
    # .flatMap(fl)\
    # .map(lambda word: (word,1))\
    # .reduceByKey(lambda a,b:a+b)\
    # .map(lambda x: '	'.join([x[0], str(x[1])]))\
    # .saveAsTextFile("/pyspark_wordcount_output")

    # for ss in resultRdd.collect():
    # print(ss)

    sc.stop()
