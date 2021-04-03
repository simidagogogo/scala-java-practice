package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/4/2 22:42
 * @note
 */
object FindTotalWorthSequential extends App {
  val symbolsAndUnits = StockPriceFinder.getTickersAndUnits

  println("Ticker Units Closing Price($) Total Value($)")

  val startTime = System.nanoTime()

  val valuesAndWorth = symbolsAndUnits.keys.par.map{ symbol =>
      val units = symbolsAndUnits(symbol)
      val latestClosingPrice = StockPriceFinder.getLatestClosingPrice(symbol)
      val value = units * latestClosingPrice

      (symbol, units, latestClosingPrice, value.toDouble)
  }


  // 这样写对于并行集合有问题,因为是可变的
/*
  var worth = 0.0D
  val netWorth = valuesAndWorth.foreach(r =>
      worth += r._4
  )
*/

  val netWorth = valuesAndWorth.foldLeft((0.0D)){(worth, valueAndWorth) =>
    val (_, _, _, value) = valueAndWorth
    worth + value
  }

  val endTime = System.nanoTime()

  valuesAndWorth
    .toList
    .sortBy(_._1)
    .foreach(valueAndWorth => {
      val (symbol, units, latestClosingPrice, value) = valueAndWorth
      println(f"$symbol%-7s $units%-5d     $latestClosingPrice%15.2f  $value%.2f")
    })

  println(f"The total value of your investments is $$$netWorth%.2f")
  println(f"Took ${(endTime - startTime) / 1000000000.0}%2f seconds")
}
