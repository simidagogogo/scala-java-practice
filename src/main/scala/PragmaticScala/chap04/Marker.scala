package PragmaticScala.chap04

import scala.collection._

/**
 * @author zhangda
 * @date 2021/3/18 12:50
 * @note
 */

class Marker private(val color: String) {
  override def toString: String = s"marker color $color"
}

object Marker {
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"),
  )

  // 类似Java中的静态方法, 可以直接对类进行调用
  def supportedColors: Iterable[String] = markers.keys

  def apply(color: String): Marker = markers.getOrElseUpdate(color, new Marker(color))

  def main(args: Array[String]): Unit = {
    println(s"Supported colors are : ${Marker.supportedColors}")
    println(Marker("blue"))
    println(Marker("red"))
  }
}
