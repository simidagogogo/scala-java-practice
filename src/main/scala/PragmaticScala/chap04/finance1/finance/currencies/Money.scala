package PragmaticScala.chap04.finance1.finance.currencies

import Currency.{CNY, Currency}


/**
 * @author zhangda
 * @date 2021/3/18 13:08
 * @note
 */
class Money(val amount: Int, val currency: Currency) {
  override def toString: String = s"$amount $currency"
}


object Money {
  def main(args: Array[String]): Unit = {
    val money = new Money(100, CNY)

    println(s"money = ${money}")
  }
}