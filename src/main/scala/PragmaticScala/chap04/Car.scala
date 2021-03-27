package PragmaticScala.chap04

/**
 * @author zhangda
 * @date 2021/3/17 00:17
 * @note
 */
class Car(val year: Int) {
  private var milesDriven: Int = 0

  def miles: Int = milesDriven

  def drive(distant: Int) = {
    milesDriven += Math.abs(distant)
  }
}

object Car {
  def main(args: Array[String]): Unit = {
    val car = new Car(2015)
    println(s"Car made in year ${car.year}")
    println(s"Miles driver ${car.miles}")
    println("Drive for 10 miles")
    car.drive(10)
    println(s"Miles driven ${car.miles}")
  }
}
