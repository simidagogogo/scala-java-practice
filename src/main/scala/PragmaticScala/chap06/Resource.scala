package PragmaticScala.chap06

/**
 * @author zhangda
 * @date 2021/3/28 00:35
 * @note
 */
class Resource private() {
  println("Starting transaction...")

  private def cleanUp() = {
    println("Ending Transaction...")

  }

  def op1() = {
    println("Operation1")
  }

  def op2() = {
    println("Operation2")
  }

  def op3() = {
    println("Operation3")
  }
}

object Resource {
  def use(codeBlock: Resource => Unit) = {
    val resource = new Resource
    try {
      codeBlock(resource)
    } finally {
      resource.cleanUp()
    }
  }

  def main(args: Array[String]): Unit = {
    Resource.use { resource: Resource =>
      resource.op1()
      resource.op2()
      resource.op3()
      resource.op1()
    }
  }
}