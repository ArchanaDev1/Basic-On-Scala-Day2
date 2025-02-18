//Custom Control Structure
object Task1 {
  def repeat(n: Int)(block: => Unit): Unit = {
    for (_ <- 1 to n) {
      block
    }
  }
}