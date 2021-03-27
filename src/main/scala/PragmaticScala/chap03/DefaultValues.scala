package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/15 23:36
 * @note
 */
object DefaultValues {

  def lover(name: String = "lianmeng", sex: String = "female") = {
    println(s"name = ${name}, sex = ${sex}")
  }

  def main(args: Array[String]): Unit = {
    lover("zhangda", "male")
    lover("luyue")
    lover()

    lover(sex = "male", name = "zhangda")
  }
}
