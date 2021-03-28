package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 18:05
 * @note  使用case类进行模式匹配
 */
trait Trade
//abstract class Trade

case class Sell(stockSymbol: String, quantity: Int) extends Trade
case class Buy(stockSymbol: String, quantity: Int) extends Trade
case class Hedge(stockSymbol: String, quantity: Int) extends Trade

object TradeProcessor {
  // 多态
  def processTransaction(request: Trade) = {
    request match {
      case Sell(stock, 1000) => println(s"Selling 1000-units of $stock")
      case Sell(stock, quantity) => println(s"Selling $quantity units of $stock")
        // 守卫式
      case Buy(stock, quantity) if quantity > 2000 => println(s"Buying $quantity (large) units of $stock")
      case Buy(stock, quantity) => println(s"Buying $quantity units of $stock")
    }
  }

  def main(args: Array[String]): Unit = {
    processTransaction(Sell("GOOG", 500))
    processTransaction(Buy("GOOG", 7000))
    processTransaction(Sell("GOOG", 1000))
    processTransaction(Buy("GOOG", 3000))
  }
}
