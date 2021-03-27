package PragmaticScala.chap04

/**
 * @author zhangda
 * @date 2021/3/26 13:20
 * @note
 */
class Vehicle(val id: Int, val year: Int) {
  override def toString: String = s"ID: $id Year: $year"
}

class Plant(override val id: Int, override val year: Int, var fuelLevel: Int)
extends Vehicle(id, year) {
  override def toString: String = s"${super.toString} Fuel Level: ${fuelLevel}"
}

object Plant{
  def main(args: Array[String]): Unit = {
    val plant = new Plant(1, 2015, 100)
    println(s"plant = ${plant}")
  }
}
