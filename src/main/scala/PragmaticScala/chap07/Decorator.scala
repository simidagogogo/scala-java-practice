package PragmaticScala.chap07

/**
 * @author zhangda
 * @date 2021/3/28 10:35
 * @note
 */
abstract class Check {
  def check: String = "Checked Application Details..."
}

trait CreditCheck extends Check {
  override def check: String = s"Checked Credit... ${super.check}"
}

trait EmployCheck extends Check {
  override def check: String = s"Checked Employment... ${super.check}"
}

trait CriminalRecordCheck extends Check {
  override def check: String = s"Checked Criminal Records... ${super.check}"
}

object Decorator extends App {
  val apartmentApplication = new Check with CreditCheck with CriminalRecordCheck
  println(s"apartmentApplication.check = ${apartmentApplication.check}")

  val employmentApplication = new Check with CriminalRecordCheck with EmployCheck
  println(s"employmentApplication.check = ${employmentApplication.check}")
}