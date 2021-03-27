package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 21:13
 * @note
 */
object DateUtil {

  val ago = "ago"
  val from_now = "from_now"

  implicit class DateHelper(val offset: Int) {
    import java.time.LocalDate
    def days(when: String): LocalDate = {
      val today = LocalDate.now
      when match {
        case "ago" => today.minusDays(offset)
        case "from_now" => today.plusDays(offset)
        case _ => today
      }
    }
  }
}

object UseDateUtil extends App {
  import DateUtil._

  val past = 2 days ago
  val appointment = 5 days from_now

  println(s"past = ${past}")
  println(s"appointment = ${appointment}")
}
