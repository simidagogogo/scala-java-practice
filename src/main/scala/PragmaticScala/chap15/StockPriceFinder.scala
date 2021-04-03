package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/4/2 12:27
 * @note
 */
object StockPriceFinder {
  import scala.io.Source

  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  def getLatestClosingPrice(symbol: String): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"

    val data = Source.fromURL(url).mkString
    val lastestClosePrize = data.split("\n") // 注意这里
      //取出第二行
      .slice(1, 2)
      .map(record => {
        // 注意: 这里必须加Array, 否则类型为Any
        val Array(timestamp, open, high, low, close, volume) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")
        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .map(_.closePrice)
      .head // 不可以去掉head

    lastestClosePrize
  }

  def getTickersAndUnits: Map[String, Int] = {
    // 这是什么操作?
    val file = "/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/stocks.xml"
    val classLoader = this.getClass.getClassLoader
    val stocksXMLInputStream = classLoader.getResourceAsStream("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/stocks.xml")
    val stocksAndUnitsXML = scala.xml.XML.load(file)

    (stocksAndUnitsXML \ "symbol").foldLeft(Map[String, Int]()) {
      (map, symbolNodes) =>
        val ticker = (symbolNodes \ "@ticker").toString()
        val units = (symbolNodes \ "units").text.toInt

        map + (ticker -> units)
    }
  }
}
