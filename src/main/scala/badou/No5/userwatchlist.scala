package badou.No5

import org.apache.spark.{SparkConf, SparkContext}
import Utilis.LogUtils.green_println

import scala.sys.process._

/**
 * @author zhangda
 * @date 2021/6/14 18:46
 * @note
 */
object userwatchlist {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setMaster("local[2]")
      .setAppName("userwatchlist")

    val sc = new SparkContext(conf)

    // 路径不对
    val basePath = "../data/no_05"
    val input_path = sc.textFile(s"$basePath/train_new.data")

    val output_path = s"$basePath/output/out_2"
    s"rm -rf $output_path".!

    green_println(output_path)

    val data = input_path.map(x => {
      val ss = x.split("\t")
      val userid = ss(0)
      val itemid = ss(1)
      val score = ss(2).toDouble

      (userid, (itemid, score))
    })
      .filter(_._2._2 > 2.0)
      .groupByKey()
      .map { x =>
        val userid = x._1
        val item_score_tuple_list = x._2
        val tmp_arr = item_score_tuple_list.toArray
          .sortWith(_._2 > _._2)
          .take(5)
          .map(r => r._1 + ":" + r._2)
          .mkString(" ")

        userid + "\t" + tmp_arr
      }

    println(s"data.count() = ${data.count()}")
    data.take(10).foreach(println)

    data.saveAsTextFile(output_path)
  }
}
