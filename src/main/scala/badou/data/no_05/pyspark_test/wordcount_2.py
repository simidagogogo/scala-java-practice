# date: 2021-06-14
# note: 从hdfs读取文件, 然后打印输出

from __future__ import print_function

import sys
from operator import add
from pyspark import SparkContext, SparkConf


def fl(x):
    return x.strip().split(' ')


if __name__ == "__main__":
    conf = SparkConf().setMaster("local").setAppName("badou-wordcount")
    sc = SparkContext(conf=conf)

    in_file = sc.textFile("/The_Man_of_Property.txt")

    resultRdd = in_file\
        .flatMap(fl)\
        .map(lambda word: (word, 1))\
        .reduceByKey(lambda a, b: a + b)

    resultColl = resultRdd.collect()

    for line in resultColl:
        print(line)

    sc.stop()
