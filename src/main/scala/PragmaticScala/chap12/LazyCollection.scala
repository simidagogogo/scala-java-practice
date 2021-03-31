package PragmaticScala.chap12

/**
 * @author zhangda
 * @date 2021/3/29 23:56
 * @note
 */
object LazyCollection {

  val people = List(
    ("Mark", 32),
    ("Bob", 22),
    ("Jane", 8),
    ("Jill", 21),
    ("Nick", 50),
    ("Nancy", 42),
    ("Mike", 19),
    ("Sara", 12),
    ("Paula", 42),
    ("John", 21))

  def isOlderThan17(person: (String, Int)) = {
    println(s"isOlderThan 17 called for $person")
    val (_, age) = person
    age > 17
  }

  def isNameStartWithJ(person: (String, Int)) = {
    println(s"isNameStartsWithJ called for $person")
    val (name, _) = person

    name.startsWith("J")
  }

  def main(args: Array[String]): Unit = {
    println(people
      .view
      .filter{isOlderThan17}
    .filter{isNameStartWithJ}
    .last
    )
  }
}
