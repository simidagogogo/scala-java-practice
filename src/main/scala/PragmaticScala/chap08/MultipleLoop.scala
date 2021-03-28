package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 17:34
 * @note
 */
object MultipleLoop extends App {
  for (i <- 1 to 3; j <- 4 to 6) {
    println(s"[$i, $j]")
  }
}
