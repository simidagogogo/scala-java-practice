package PragmaticScala.chap05

import java._

/**
 * @author zhangda
 * @date 2021/3/26 23:47
 * @note
 */
object Generics2 extends App {
  var list1 = new util.ArrayList[Int]()
  var list2 = new util.ArrayList  // 实际创建的变量List指向了一个未指定参数类型的ArrayList的实例, 其实为ArrayList[Nothing]

  list1.add(-121)
//  list2.add(12)
//  list2 = list1
}
