package PragmaticScala.chap04.finance1.finance.currencies

/**
 * @author zhangda
 * @date 2021/3/20 19:02
 * @note
 */
object Charge {
  def chargeInUSD(money: Money): String = {
    def moneyInUSD = Converter.convert(money, Currency.USD)
    s"charged $$${moneyInUSD.amount}"
  }
}
