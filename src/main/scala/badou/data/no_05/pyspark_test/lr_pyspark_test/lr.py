#coding=utf8
from __future__ import print_function

import sys

from pyspark import SparkContext, SparkConf
from pyspark.mllib.regression import LabeledPoint
from pyspark.mllib.feature import HashingTF,IDF,StandardScaler
from pyspark.mllib.classification import LogisticRegressionWithSGD,SVMWithSGD,NaiveBayes
from pyspark.mllib.tree import DecisionTree

from pyspark.mllib.util import MLUtils

reload(sys)
sys.setdefaultencoding('utf-8')

if __name__ == "__main__":
    #conf = SparkConf().setMaster("spark://master:7077").setAppName("lr_pyspark_test")
    conf = SparkConf().setMaster("local").setAppName("lr_pyspark_test")
    sc = SparkContext(conf=conf)

    #in_file = sc.textFile("file:///root/spark_test_5/pyspark_test/lr_pyspark_test/data/a8a")
    data = MLUtils.loadLibSVMFile(sc, "file:///root/spark_test_5/pyspark_test/lr_pyspark_test/data/a8a")

    (trainingData, testData) = data.randomSplit([0.7, 0.3])

    model = LogisticRegressionWithSGD.train(data=trainingData, iterations=100,step=1, regType='l1', intercept=True)

    predictions = model.predict(testData.map(lambda x: x.features))
    labelsAndPredictions = testData.map(lambda lp: lp.label).zip(predictions)
    testErr = labelsAndPredictions.filter(lambda (v, p): v != p).count() / float(testData.count())
    print('Test Error = ' + str(testErr))
    print('Learned classification forest model:')
    print(model.weights)
    print(model.weights.size)
    print(model.intercept)
    ## Save and load model
    #model.save(sc,"target/tmp/myRandomForestClassificationModel")
    #sameModel = RandomForestModel.load(sc, "target/tmp/myRandomForestClassificationModel")

    sc.stop()
