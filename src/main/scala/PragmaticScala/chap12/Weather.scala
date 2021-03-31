package PragmaticScala.chap12

import scala.io.Source
import scala.xml._
/**
 * @author zhangda
 * @date 2021/3/31 21:59
 * @note
 */
object Weather extends App {

  val city = "beijing"
  def getWeatherData(city: String) = {

    val response = Source.fromURL(
      s"https://raw.githubusercontent.com/ReactivePlatform/" +
        s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
        s"weathers/$city.xml")

    val responseStr = response.mkString
    println(s"responseStr = ${responseStr}")
    val xmlResponse = XML.loadString(responseStr)
  }
}
