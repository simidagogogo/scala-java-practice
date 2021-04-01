package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/4/1 23:08
 * @note  学会了能干啥?
 */

import scala.xml._
object ReadWriteXML extends App {
  val stocksAndUnits = XML.load("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/stocks.xml")
  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")

  // foldLeft使用的目的是不创建可变变量.
  val stocksAndUnitsMap = (stocksAndUnits \ "symbol").foldLeft(Map[String, Int]()){(map, symbolNode) =>
    val ticker = (symbolNode \\ "@ticker").toString
    val units = (symbolNode \\ "units").text.toInt
    map + (ticker -> units)
  }

  // 或者
  var stocksAndUnitsMap2 = scala.collection.mutable.Map[String, Int]()
  (stocksAndUnits \ "symbol").foreach(symbolNode => {
    val ticker = (symbolNode \\ "@ticker").toString
    val units = (symbolNode \\ "units").text.toInt
    stocksAndUnitsMap2 += (ticker -> units)
//    stocksAndUnitsMap2.put(ticker, units)
  })

  println(s"Number of symbol elements found is ${stocksAndUnitsMap.size}")
  println(s"stocksAndUnitsMap2 = Number of symbol elements found is ${stocksAndUnitsMap2.size}")

  def updateUnitsAndCreateXML(element: (String, Int)) = {
    val (ticker, units) = element
    <symbol ticker={ticker}>
      <units>{units + 1}</units>
    </symbol>
  }

  val updatedStocksAndUnitsXML =
    <symbols>
      {stocksAndUnitsMap.map(updateUnitsAndCreateXML)}
    </symbols>

  XML.save("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/stocks2.xml",
    updatedStocksAndUnitsXML)

  val elemetsCount = (XML.load("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/stocks2.xml") \\ "symbol").size
  println(s"Saved file has $elemetsCount symbol elements.")
}
