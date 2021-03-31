package PragmaticScala.chap12

/**
 * @author zhangda
 * @date 2021/3/29 23:51
 * @note
 */
object LazyOrder extends App {
  import scala.io._

  def read = StdIn.readInt()

  lazy val first = read

  lazy val second = read

  if (Math.random() < 0.5) {
    second
  }

  println(first - second)

}
