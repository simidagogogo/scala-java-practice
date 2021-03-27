package PragmaticScala.chap01

import scala.io.Source._
import scala.compat.Platform.currentTime

/**
 * @author zhangda
 * @date 2021/3/3 23:30
 * @note 统计某只股票, 在某一年的收盘价
 */
object TopStock {

  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  /**
   * 获取某一年的最终收盘价
   *
   * @param symbol symbol of certain stock
   * @param year   year
   * @return
   */
  def getYearEndClosingPrice(symbol: String, year: Int) = {

    //    timestamp ,open   ,high   ,low    ,close  ,volume
    //    2018-04-16,10.0000,10.1700,9.9000 ,10.0900,28875069
    //    2018-04-13,10.2000,10.2200,9.8800 ,9.9300 ,38935658
    //    2018-04-12,9.9800 ,10.1000,9.8200 ,10.0800,47784419
    //    2018-04-11,9.8700 ,10.0300,9.7900 ,9.8200 ,29169324
    //    2018-04-10,9.7500 ,10.0400,9.7100 ,9.9800 ,43036502
    //    2018-04-09,9.7500 ,9.8400 ,9.5200 ,9.5300 ,38382608
    //    2018-04-06,9.8300 ,10.1000,9.5000 ,9.6100 ,51087146

    val url = s"https://raw.githubusercontent.com/ReactivePlatform/Pragmatic-Scala-StaticResources/master/src/main/resources/stocks/daily/daily_$symbol.csv"

    println(s"url = ${url}")

    val source = fromURL(url)
    val data = source.mkString

    val maxClosePrize = data
      .split("\n")
      .filter(record => record.startsWith(s"$year-12"))
      .map(record => {
        val Array(timestamp, open, high, low, close, volum) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")

        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .sortBy(_.date)(Ordering[Int].reverse)
      .take(1)
      .map(_.closePrice)
      .head

    maxClosePrize
  }

  def main(args: Array[String]): Unit = {

    val beginTime = currentTime

    val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
    val year = 2017

    /**
     * 串行: 17s
     * 并行: 5s
     */
    val (topStock, topPrice) = symbols
      .par
      .map(ticker => (ticker, getYearEndClosingPrice(ticker, year)))
      .maxBy(_._2)(Ordering[BigDecimal])

    println(s"Top stock of $year is $topStock closing at $$$topPrice.")

    val endTime = currentTime
    println(s"duration = ${(endTime - beginTime) / 1000} second")
  }


  //  val res = feeds.filter(r => r._1.startsWith("D"))
  //  val res = feeds.filterKeys(r => r._1.startsWith("D"))

  //  println(s"res = ${res}")

  //  printf("%d, %s ", 1, "lianmeng")

}
