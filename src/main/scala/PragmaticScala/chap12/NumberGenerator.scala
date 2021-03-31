package PragmaticScala.chap12

/**
 * @author zhangda
 * @date 2021/3/30 00:13
 * @note
 */
object NumberGenerator {

  def generator(starting: Int): Stream[Int] = {
    starting #:: generator(starting + 1) // 递归调用形式
  }

  def main(args: Array[String]): Unit = {
    println(generator(25))
    println(generator(25).take(10).force)   // 强制生成值
    println(generator(25).take(10).toList)  // 转换为了严格集合
    println(generator(25).takeWhile(_ < 40).force) // 强制生成值, 直到满足某个条件
  }
}
