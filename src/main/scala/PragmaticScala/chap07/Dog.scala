package PragmaticScala.chap07

/**
 * @author zhangda
 * @date 2021/3/28 10:08
 * @note
 */
class Animal

class Dog(val name: String) extends Animal with Friend {
  override def listen(): Unit = println(s"$name's listening quietly'")
}

class Human(val name: String) extends Friend

class Woman(override val name: String) extends Human(name) {
  override def listen(): Unit = println(s"woman $name listening")
}

class Man(override val name: String) extends Human(name) {
  override def listen(): Unit = println(s"man $name listening")
}

class Cat(val name: String) extends Animal