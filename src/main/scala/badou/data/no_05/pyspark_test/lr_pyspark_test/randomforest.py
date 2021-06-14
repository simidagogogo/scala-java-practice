#coding=utf8
from __future__ import print_function

import sys

from pyspark import SparkContext, SparkConf
from pyspark.mllib.regression import LabeledPoint
from pyspark.mllib.feature import HashingTF,IDF,StandardScaler
from pyspark.mllib.classification import LogisticRegressionWithSGD,SVMWithSGD,NaiveBayes
from pyspark.mllib.tree import DecisionTree
from pyspark.mllib.tree import RandomForest, RandomForestModel

from pyspark.mllib.util import MLUtils

reload(sys)
sys.setdefaultencoding('utf-8')

if __name__ == "__main__":
    #conf = SparkConf().setMaster("spark://master:7077").setAppName("lr_pyspark_test")
    conf = SparkConf().setMaster("local").setAppName("lr_pyspark_test")
    sc = SparkContext(conf=conf)

    data = MLUtils.loadLibSVMFile(sc, "file:///home/9_codes/pyspark_test/lr_pyspark_test/data/a8a")

    (trainingData, testData) = data.randomSplit([0.7, 0.3])

    model = RandomForest.trainClassifier(\
            trainingData, numClasses=2, \
            categoricalFeaturesInfo={},\
            numTrees=3, \
            featureSubsetStrategy="auto",\
            impurity='gini', maxDepth=4, maxBins=32)

    predictions = model.predict(testData.map(lambda x: x.features))
    labelsAndPredictions = testData.map(lambda lp: lp.label).zip(predictions)
    testErr = labelsAndPredictions.filter(lambda (v, p): v != p).count() / float(testData.count())
    print('Test Error = ' + str(testErr))
    print('Learned classification forest model:')
    print(model.toDebugString())
    ## Save and load model
    #model.save(sc,"target/tmp/myRandomForestClassificationModel")
    #sameModel = RandomForestModel.load(sc, "target/tmp/myRandomForestClassificationModel")

    sc.stop()
