package PragmaticScala.chap06

/**
 * @author zhangda
 * @date 2021/3/27 23:01
 * @note
 */
object fun2 {

  def inject(arr: Array[Int], initial: Int, operation: (Int, Int) => Int): Int = {
    var carryOver = initial
    arr.foreach(element => carryOver = operation(carryOver, element))
    carryOver
  }

  def inject2(arr: Array[Int], initial: Int)(operation: (Int, Int) => Int): Int = {
    var carryOver = initial
    arr.foreach(element => carryOver = operation(carryOver, element))
    carryOver
  }

  def main(args: Array[String]): Unit = {
    val array = Array(2, 3, 5, 1, 6, 4)
    val sum = inject(array, 0, (carray, elem) => carray + elem)
//    val sum = inject(array, 0,  _ + _)

    val max = inject(array, Integer.MIN_VALUE, (carry, elem) => Math.max(carry, elem))
//    val max = inject(array, Integer.MIN_VALUE, Math.max(_, _))

    println(s"sum = ${sum}")
    println(s"max = ${max}")

    // 函数库内部实现
    val sum2 = array.foldLeft(0){(sum, elem) => sum + elem}
    val max2 = array.foldLeft(Integer.MIN_VALUE){(large, elem) => Math.max(large, elem)}
    println(s"sum2 = ${sum2}")
    println(s"max2 = ${max2}")

    // 柯里化函数
    val sum3 = inject2(array, 0){(carray, elem) => carray + elem}
    println(s"sum = ${sum3}")

    val max3 = inject2(array, Integer.MIN_VALUE){(carry, elem) => Math.max(carry, elem)}
    println(s"max = ${max3}")
  }
}

