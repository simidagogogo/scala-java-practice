package PragmaticScala.chap12

import scala.#::

/**
 * @author zhangda
 * @date 2021/3/31 13:14
 * @note
 */
object Primes {

  def isDivisibleBy(number: Int, divisor: Int) = {
    number % divisor == 0
  }

  def isPrime(number: Int) = {
    number > 1 && !(2 until number).exists(isDivisibleBy(number, _))
  }


  def primes(starting: Int): Stream[Int] = {
    println(s"computing for $starting")
    if (isPrime(starting)) {
      starting #:: primes(starting + 1)
    } else {
      primes(starting + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val primesFrom100 = primes(100)

    println(primesFrom100.take(3).toList)
    println(s"Let's ask for more...")
    println(primesFrom100.take(4).toList)
  }
}
