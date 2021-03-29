package PragmaticScala.chap11

/**
 * @author zhangda
 * @date 2021/3/29 13:19
 * @note
 */
object Mad {
  def mad(parameter: Int): Int = {
    if (parameter == 0) {
      throw new RuntimeException("Error")
    } else {
      1 * mad(parameter - 1)
    }
  }

  def mad2(parameter: Int): Int = {
    if (parameter == 0) {
      throw new RuntimeException("Error")
    } else {
      mad2(parameter - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(mad(5))
    println(mad2(5))
  }

// println(mad(5)) 栈跟踪表明在异常抛出之前, 我们调用了6次mad()函数
//  Exception in thread "main" java.lang.RuntimeException: Error
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:11)
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:13)
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:13)
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:13)
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:13)
//  at PragmaticScala.chap11.Mad$.mad(Mad.scala:13)
//  at PragmaticScala.chap11.Mad$.main(Mad.scala:18)
//  at PragmaticScala.chap11.Mad.main(Mad.scala)

// println(mad2(5)) 尾递归优化后, 深度只有1层
//  Exception in thread "main" java.lang.RuntimeException: Error
//  at PragmaticScala.chap11.Mad$.mad2(Mad.scala:19)
//  at PragmaticScala.chap11.Mad$.main(Mad.scala:27)
//  at PragmaticScala.chap11.Mad.main(Mad.scala)

}
