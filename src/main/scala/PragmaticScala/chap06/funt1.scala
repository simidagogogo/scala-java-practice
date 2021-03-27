package PragmaticScala.chap06

/**
 * @author zhangda
 * @date 2021/3/27 22:35
 * @note
 */
object funt1 {

  // 不可复用
  def sum(number: Int) = {
    var result = 0
    for (i <- 1 to number) {
      result += i
    }
    result
  }

  // 可复用
  def totalResultOverRange(number:Int , codeBlock: Int => Int): Int = {
    var result = 0
    for (i <- 1 to number) {
      result += codeBlock(i)
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val num = 11
    // 求和
    println(sum(num))
    println(totalResultOverRange(num, i => i))

    // 所有偶数之后
    println(totalResultOverRange(num, i => if (i%2 == 0) i else 0))

    // 所有基数之和
    println(totalResultOverRange(num, i => if (i%2 == 1) i else 0))

    // 统计基数的个数
    println(totalResultOverRange(num, i => i % 2))

    // 统计偶数的个数
    println(totalResultOverRange(num, i => 1 - i % 2))
    println(totalResultOverRange(num, (i:Int) => if (i % 2 == 0) 1 else 0))
  }
}
