package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 13:17
 * @note
 */
object NothingExample {
  def someOp(number: Int): Int = {
    if (number < 10) {
      number * 2
    } else {
      throw new RuntimeException("invalid argument")
    }
  }

  def main(args: Array[String]): Unit = {
    println(65.toChar)

    val r1 = someOp(5)
    println(s"r1 = ${r1}")

    val r2  = someOp(10)
    println(s"r2 = ${r2}")
  }
}
