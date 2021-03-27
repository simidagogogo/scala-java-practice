package PragmaticScala.chap04

/**
 * @author zhangda
 * @date 2021/3/26 13:15
 * @note
 */
object CopApp extends App {
  type Cop = PoliceOfficer

  val topCop = new Cop("Jack")
  println(topCop.getClass)
}
