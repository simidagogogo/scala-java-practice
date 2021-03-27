package PragmaticScala.chap05

import scala.reflect.internal.util.Origins.MultiLine

/**
 * @author zhangda
 * @date 2021/3/27 20:26
 * @note
 */
class MyList[+T] {}
class MyList2[-T] {}

object MyList extends App {
  var list1 = new MyList[Int]
  var list2: MyList[Any] = _

  list2 = list1
//  list1 = list2 // 编译报错

  var list3 = new MyList2[Int]
  var list4:MyList2[Any] = _

  list3 = list4
//  list4 = list3 // 编译报错
}



