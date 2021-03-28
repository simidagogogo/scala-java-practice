package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 13:13
 * @note
 */
object MatchLiterals {

  def activity(day: String): Unit = {
    day match {
      case "Sunday" => println("Eat, sleep, repeat... ")
      case "Saturday" => println("Hang out with friends... ")
      case "Monday" => println("...code for fun... ")
      case "Friday" => println("...read a good book... ")
    }
  }

  def main(args: Array[String]): Unit = {
    List("Monday", "Sunday", "Saturday").foreach(activity)
  }
}
