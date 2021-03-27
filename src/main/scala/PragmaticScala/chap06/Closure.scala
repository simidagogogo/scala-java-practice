package PragmaticScala.chap06

/**
 * @author zhangda
 * @date 2021/3/28 00:17
 * @note
 */
object Closure {

  def loopThrough(number: Int)(closure: Int => Unit) = {
    for (i <- 1 to number){
      closure(i)
    }
  }

  def main(args: Array[String]): Unit = {
    var result = 0
    val addIt = {value : Int => result += value}

    loopThrough(10) {elem => addIt(elem)}
//    loopThrough(10) {addIt}
//    loopThrough(10) {elem => result += elem}
//    loopThrough(10) {result += _}

    println(s"result = ${result}")

    result = 0
    loopThrough(5){addIt}
    println(s"result = ${result}")

    var product = 1
    loopThrough(5){product *= _}
    println(s"product = ${product}")
  }
}
