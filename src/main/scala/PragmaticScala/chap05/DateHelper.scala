package PragmaticScala.chap05

import scala.language.implicitConversions
import java.time.LocalDate

/**
 * @author zhangda
 * @date 2021/3/27 20:38
 * @note
 */

class DateHelper(offset: Int) {
  def days(when: String): LocalDate = {
    val today = LocalDate.now()
    when match {
      case "ago" => today.minusDays(offset)
      case "from_now" => today.plusDays(offset)
      case _ => today
    }
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"
  implicit def convertInt2DateHelper(offset: Int): DateHelper = new DateHelper(offset)
}
