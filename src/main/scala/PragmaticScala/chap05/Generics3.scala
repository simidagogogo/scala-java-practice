package PragmaticScala.chap05

import java._
/**
 * @author zhangda
 * @date 2021/3/27 12:52
 * @note
 */
object Generics3 extends App {

  var list1 = new util.ArrayList[Int]()
  var list2 = new util.ArrayList[Any]()

  var ref1: Int = 1
  var ref2: Any = _

  ref2 = ref1 // 编译通过

//  list2 = list1 // 编译错误
}
