package PragmaticScala.chap04

import PragmaticScala.chap04.finance1.finance.currencies.Currency


/**
 * @author zhangda
 * @date 2021/3/18 13:14
 * @note
 */
object UseCurrency {
  def main(args: Array[String]): Unit = {
    Currency.values.foreach(currency => println(currency))
  }
}
