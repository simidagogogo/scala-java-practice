package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/2 23:37
 * @note
 */
object Person {

}


class Person(val firstName: String, val lastName: String) {
  override def toString: String = firstName + " " + lastName
}