object Task3 {
  def makeAdder(x: Int): Int => Int = {
    (y: Int) => x + y
  }
}