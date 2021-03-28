package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 15:22
 * @note **design-by-contract style** 按合约编程
 */
object ContractDesign {

  def addNaturals(nats: List[Int]): Int = {
    require(nats forall (_ >= 0), "List contains negative numbers")
    nats.foldLeft(0)(_ + _)
  } ensuring(_ >= 0)

  def main(args: Array[String]): Unit = {
    val arr = List(1, 2, 4, -5, 88)
    val res = addNaturals(arr)

    println(s"res = ${res}")
  }
}
