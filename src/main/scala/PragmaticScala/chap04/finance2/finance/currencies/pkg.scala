package PragmaticScala.chap04.finance2.finance

/**
 * @author zhangda
 * @date 2021/3/20 19:11
 * @note
 */
import PragmaticScala.chap04.finance2.finance.currencies.Currency.Currency

package object currencies {
  def convert(money: Money, to: Currency): Money = {
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
