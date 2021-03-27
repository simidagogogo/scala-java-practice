package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 21:29
 * @note
 */
object MyInterpolator {

  implicit class Interpolator(val context: StringContext) extends AnyVal {
    def mask(args: Any*): StringBuilder = {
      val processed = context.parts.zip(args).map(item => {
        val (text, expression) = item
        if (text.endsWith("^")) {
          s"${text.split('^')(0)}$expression"
        } else {
          s"$text... ${expression.toString.takeRight(4)}"
        }
      }).mkString

      new StringBuilder(processed).append(context.parts.last)

    }
  }
}
