package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/3 10:35
 * @note
 */
object UseJDKClass {
  def main(args: Array[String]): Unit = {
    import java.util.Currency
    val currencies = Currency.getAvailableCurrencies
    println(s"${currencies.size()} currencies are available.")
  }
}
