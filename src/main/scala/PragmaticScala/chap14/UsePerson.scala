package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/2 23:42
 * @note
 */
object UsePerson {
  def main(args: Array[String]): Unit = {
    val simida = new Person("simida", "zhangda")

    val simidaDogs = List(new Dog("wangwang"), new Dog("dawang"), new Dog("xiaowang"))

    println(s"simida had several dogs ${simidaDogs.mkString(", ")}...")

  }
}
