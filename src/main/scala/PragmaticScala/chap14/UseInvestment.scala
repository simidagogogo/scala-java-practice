//package PragmaticScala.chap14
//
///**
// * @author zhangda
// * @date 2021/4/3 10:52
// * @note
// */
//
//
//
//object UseInvestment {
//  import investments._
//
//  def main(args: Array[String]): Unit = {
//    val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
//    println(investment.getClass)
//
////    val theYield1 = investment.yield // 编译错误
////    val theYield2 = investment.yield() // 编译错误
//
//    val theYield3 = investment.`yield` // 编译正确
//    val theYield4 = investment.`yield`() // 编译正确
//
//  }
//}
