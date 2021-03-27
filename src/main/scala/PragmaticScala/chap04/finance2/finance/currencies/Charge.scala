package PragmaticScala.chap04.finance2.finance.currencies

/**
 * @author zhangda
 * @date 2021/3/20 19:14
 * @note
 */
object Charge {
  def chargeInUSD(money: Money): String = {
    def moneyInUSD = convert(money, Currency.USD)
    s"charged $$${moneyInUSD.amount}"
  }
}