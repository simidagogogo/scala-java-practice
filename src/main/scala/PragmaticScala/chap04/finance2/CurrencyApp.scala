package PragmaticScala.chap04.finance2

import PragmaticScala.chap04.finance2.finance.currencies.Money
import PragmaticScala.chap04.finance2.finance.currencies._
import PragmaticScala.chap04.finance2.finance.currencies.{Charge, Currency, Money}

/**
 * @author zhangda
 * @date 2021/3/20 19:28
 * @note
 */
object CurrencyApp extends App {
  var moneyInGBP = new Money(10, Currency.USD)

  println(Charge.chargeInUSD(moneyInGBP))
  println(convert(moneyInGBP, Currency.USD))
}
