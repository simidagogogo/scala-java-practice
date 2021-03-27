package PragmaticScala.chap05

import DateHelper._


/**
 * @author zhangda
 * @date 2021/3/27 20:45
 * @note
 */
object DaysDSL extends App {

  val past = 2 days ago
  val appointment = 5 days from_now

  println(s"past = ${past}")
  println(s"appointment = ${appointment}")
}
