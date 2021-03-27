package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 13:42
 * @note  这个东西怎么在实际中使用?
 */
object UsingEither {
  def compute(input: Int): Either[String, Double] = {
    if (input > 0) {
      Right(math.sqrt(input))
    } else {
      Left("Error computing, invalid input")
    }
  }

  def displayResult(result: Either[String, Double]) = {
    println(s"Raw: $result")

    result match {
      case Right(value) => println(s"result: $value")
      case Left(err) => println(s"Error: $err")
    }
  }

  def main(args: Array[String]): Unit = {
    displayResult(compute(4))

    displayResult(compute(-4))
  }
}
