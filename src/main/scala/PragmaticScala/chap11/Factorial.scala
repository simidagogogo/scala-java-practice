package PragmaticScala.chap11

/**
 * @author zhangda
 * @date 2021/3/29 12:58
 * @note
 */
object Factorial {

  def factorial(number: Int): BigInt = {
    if (number == 0) {
      1
    } else {
      number * factorial(number - 1)
    }
  }

  @scala.annotation.tailrec
  def factorial2(fact: BigInt, number: Int): BigInt = {
    if (number == 0) {
      fact
    } else {
      factorial2(fact * number, number - 1)
    }
  }

  def main(args: Array[String]): Unit = {
//    println(factorial(50000))
    println(factorial2(1, 10000))
  }
}
