package badou.No5

import org.apache.spark.{SparkConf, SparkContext}
import Utilis.LogUtils.{green, green_println}
import scala.sys.process._;

/**
 * @author zhangda
 * @date 2021/6/14 16:36
 * @note
 */
object wordcount {

  def main(args: Array[String]): Unit = {
    green_println("123")

    val conf = new SparkConf()
      .setMaster("local")
      .setAppName("wordcount")

    val sc = new SparkContext(conf)

    val basePath = "/Users/zhangda/Documents/badou_15th/practice/15_1_code/mapreduce_wordcount_python"
    val inputPath = s"$basePath/The_Man_of_Property.txt"
    green_println(inputPath)
    val rdd = sc.textFile(inputPath)
    println(s"rdd.count() = ${rdd.count()}")

    val data = rdd
      .flatMap(_.split(" "))
      .map((_, 1))
      .reduceByKey(_ + _)
      .map(x => x._1 + "\t" + x._2)

    val outputPath = s"$basePath/output/out_1"
    s"rm -rf $outputPath".!

    green_println(outputPath)
    data.saveAsTextFile(outputPath)
  }
}