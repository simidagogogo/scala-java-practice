#coding=utf8
from __future__ import print_function

import sys
from pyspark import SparkContext, SparkConf

reload(sys)
sys.setdefaultencoding('utf-8')

def fl(x):
    return x.strip().split(' ')

if __name__ == "__main__":
    conf = SparkConf().setMaster("local").setAppName("badou-wordcount")
    sc = SparkContext(conf=conf)

    in_file = sc.textFile("/The_Man_of_Property.txt")

    resultRdd = in_file\
            .flatMap(fl)\
            .map(lambda word: (word,1))\
            .reduceByKey(lambda a,b:a+b)\
            .map(lambda x: '	'.join([x[0], str(x[1])]))\
            .saveAsTextFile("/pyspark_wordcount_output")

    #for ss in resultRdd.collect():
        #print(ss)

    sc.stop()


