package PragmaticScala.chap04.finance1

/**
 * @author zhangda
 * @date 2021/3/20 19:03
 * @note
 */

import finance.currencies._
object CurrencyApp extends App {
  var moneyInBGBP = new Money(10, Currency.GBP)

  println(Charge.chargeInUSD(moneyInBGBP))
  println(Converter.convert(moneyInBGBP, Currency.USD))
}
