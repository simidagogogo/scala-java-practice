package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/17 00:00
 * @note todo 不很很清晰
 */
object Protected {

  class Vehicle {
    protected def checkEngine() {}
  }

  class Car extends Vehicle {
    def start(): Unit = {
      checkEngine()
    }

    def tow(car:Car): Unit = {
      car.checkEngine()
    }

    def tow(vehicle: Vehicle): Unit = {
//      vehicle.checkEngine() // 编译错误
    }
  }

  class GasStation {
    def fileGas(vehicle: Vehicle): Unit = {
//      vehicle.checkEngine() // 编译错误
    }
  }

}
