# coding=utf8

# date: 2021-06-14
# note: 从输入读取, 并打印输出

from __future__ import print_function

import sys
from operator import add

from pyspark import SparkContext, SparkConf

if __name__ == "__main__":

    conf = SparkConf()\
        .setMaster("local")\
        .setAppName("badou-wordcount")

    sc = SparkContext(conf=conf)

    data = ["hello", "world", "hello", "word", "count", "count", "hello"]

    rdd = sc.parallelize(data)
    resultRdd = rdd\
        .map(lambda word: (word, 1))\
        .reduceByKey(lambda a, b: a + b)

    resultColl = resultRdd.collect()

    for line in resultColl:
        print(line)

    sc.stop()
