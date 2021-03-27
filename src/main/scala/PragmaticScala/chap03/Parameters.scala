package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/15 23:30
 * @note  变长参数值
 */
object Parameters {

  def max(values: Int*) = {
    println(s"values.getClass = ${values.getClass}")
    values.foldLeft(values(0)) {Math.max}
  }

  def main(args: Array[String]): Unit = {
    val a = max(8, 2, 3)
    val b = max(2, 5, 4, 7, 1, 6)

    println(s"a = ${a}")
    println(s"b = ${b}")

    val numbers = Array(2, 5, 3, 7, 1, 6)
    val c =  max(numbers:_*)  // 数组展开标记(array explode notationo)
  }
}
