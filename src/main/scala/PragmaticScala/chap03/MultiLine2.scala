package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/16 00:33
 * @note
 */
object MultiLine2 {
  def main(args: Array[String]): Unit = {
    val str = """hello, world! my name is simida""".stripMargin

    val s =
      """hello, world
        |my name is simida"
        |""".stripMargin
  }
}
