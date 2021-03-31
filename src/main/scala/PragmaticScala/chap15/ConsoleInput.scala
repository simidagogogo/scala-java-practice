package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/3/31 08:49
 * @note
 */
object ConsoleInput extends App {
  import scala.io._

  println("Please enter a ticker symbol:")
  val symbol = StdIn.readLine()
  println(s"OK, got it, you own $symbol")
}
