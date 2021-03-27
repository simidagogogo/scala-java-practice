package PragmaticScala.chap04.finance2.finance.currencies

/**
 * @author zhangda
 * @date 2021/3/20 19:22
 * @note
 */

import Currency.{CNY, Currency}

class Money(val amount: Int, val currency: Currency) {
  override def toString: String = s"$amount $currency"
}


object Money {
  def main(args: Array[String]): Unit = {
    val money = new Money(100, CNY)

    println(s"money = ${money}")
  }
}
