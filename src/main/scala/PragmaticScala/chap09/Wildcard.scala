package PragmaticScala.chap09

import PragmaticScala.chap09.Wildcard.DayOfWeek

/**
 * @author zhangda
 * @date 2021/3/28 13:19
 * @note  注意枚举类型的使用方法
 */
object Wildcard {

  object DayOfWeek extends Enumeration {
    val SUNDAY: DayOfWeek.Value = Value("Sunday")
    val MONDAY: DayOfWeek.Value = Value("Monday")
    val TUESDAY: DayOfWeek.Value = Value("Tuesday")
    val WEDNESDAY: DayOfWeek.Value = Value("Wednesday")
    val THURSDAY: DayOfWeek.Value = Value("Thursday")
    val FRIDAY: DayOfWeek.Value = Value("Friday")
    val SATURDAY: DayOfWeek.Value = Value("Saturday")
  }

  def activity(day: DayOfWeek.Value): Unit = {
    day match {
      case DayOfWeek.SUNDAY => println("Eat, sleep, repeat...")
      case DayOfWeek.SATURDAY => println("Hang out with friends")
      case _ => println("....code for fun...")
    }
  }

  def main(args: Array[String]): Unit = {
    activity(DayOfWeek.SATURDAY)
    activity(DayOfWeek.MONDAY)
  }
}

