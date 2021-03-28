package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/22 22:51
 * @note
 */
object StockService {
  def process(input: String) = {
    input match {
      case Symbol() => println(s"Look up price for valid symbol $input")
      case ReceiveStockPrice(symbol @ Symbol(), price) => println(s"Received price $$$price for symbol $symbol")
      case _ => println(s"Invalid input $input")
    }
  }
}

object ReceiveStockPrice {
  def unapply(input: String): Option[(String, Double)] = {
    try {
      if (input.contains(":")) {
        val splitQuote = input.split(":")
        Some((splitQuote(0), splitQuote(1).toDouble))
      } else {
        None
      }
    } catch {
      case _: NumberFormatException => None
    }
  }
}

object Symbol {
  def unapply(symbol: String): Boolean = {
    symbol == "GOOG" || symbol == "IBM"
  }

  def main(args: Array[String]): Unit = {
    StockService.process("GOOG")
    StockService.process("IBM")
    StockService.process("ERR")

    println("--------------------------")
    StockService.process("GOOG")
    StockService.process("GOOG:310.84")
    StockService.process("GOOC:BUY")
    StockService.process("ERR:12.21")
  }
}
