object Task1 {
  def computeArea(radius: Double): Double = {
    if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative")
    math.Pi * radius * radius
  }
}