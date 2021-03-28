package PragmaticScala.chap07

/**
 * @author zhangda
 * @date 2021/3/28 10:04
 * @note
 */
trait Friend {
  // 抽象不可变字段
  val name: String

  // 部分实现的方法
  def listen() = println(s"Your friend $name is listening."
  )
}




