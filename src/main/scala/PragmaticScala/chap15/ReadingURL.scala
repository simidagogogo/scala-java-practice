package PragmaticScala.chap15

import scala.io.Source
import java.net.URL

/**
 * @author zhangda
 * @date 2021/4/1 12:54
 * @note
 */
object ReadingURL extends App {
  val source = Source.fromURL(new URL("http://www.baidu.com"))

  println(s"What's Source?: $source")
  println(s"Raw String: ${source.mkString}")
}
