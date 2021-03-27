package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 15:24
 * @note
 */

object PlayWithPets extends App {

  class Pet(val name: String) {
    override def toString: String = name
  }

  class Dog(override val name: String) extends Pet(name)

//  报错, 类型不匹配
//  def workWithPets(pets: Array[Pet]) = {
//    println(s"Playing with pets: ${pets.mkString(", ")}")
//  }

  val dogs = Array(new Dog("simida"), new Dog("luyue"))

  def playWithPets[T <: Pet](pets: Array[T]) = {
    println(s"Playing with pets: ${pets.mkString(", ")}")
  }

  playWithPets(dogs)


  def coptPets[S, D>:S](fromPets: Array[S], toPets: Array[D]) = {}

  val pets = new Array[Pet](10)
  coptPets(dogs, pets)
}
