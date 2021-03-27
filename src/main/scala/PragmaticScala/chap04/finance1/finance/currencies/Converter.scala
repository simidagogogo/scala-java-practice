package PragmaticScala.chap04.finance1.finance.currencies

import Currency.Currency

/**
 * @author zhangda
 * @date 2021/3/18 13:25
 * @note
 */
object Converter {
  def convert(money: Money, to:Currency): Money = {
    // 获取当前的市场汇率
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}




