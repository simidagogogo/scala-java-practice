package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 16:27
 * @note
 */

class Person(val firstName: String, val lastName: String)

object Person extends App{
  def apply(firstName: String, lastName: String): Person = new Person(firstName, lastName)

  val friends = List(Person("simida", "zhang"), Person("lian", "meng"), Person("luyue", "wang"))

  val lastNames = for (friend <- friends; lastName = friend.lastName) yield lastName

  println(lastNames.mkString(", "))
}

