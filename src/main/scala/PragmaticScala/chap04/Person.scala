package PragmaticScala.chap04

/**
 * @author zhangda
 * @date 2021/3/20 20:06
 * @note
 */
class Person(val firstName: String, val lastName: String) {
  var position: String = _

  println(s"Creating $toString")

  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }

  override def toString: String = {
    s"$firstName $lastName holds $position position"
  }
}

object Person{
  def main(args: Array[String]): Unit = {
    val john = new Person("John", "Smith", "Analyst")
    println(john)

    val bill = new Person("BIll", "Walker")
    println(bill)
  }
}

// Creating John Smith holds null position
// John Smith holds Analyst position
// Creating BIll Walker holds null position
// BIll Walker holds null position