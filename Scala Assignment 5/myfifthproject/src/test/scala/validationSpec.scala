import org.scalatest.funsuite.AnyFunSuite

class TaskTests extends AnyFunSuite {
  test("computeArea should calculate the area of a circle correctly") {
    assert(Task1.computeArea(1) === math.Pi)
    assert(Task1.computeArea(0) === 0)
    assert(Task1.computeArea(2) === 4 * math.Pi)
  }

  test("computeArea should handle negative radius") {
    assertThrows[IllegalArgumentException] {
      Task1.computeArea(-1)
    }
  }

  test("computeArea should handle non-numeric radius") {
    assertThrows[NumberFormatException] {
      Task1.computeArea("radius".toDouble)
    }
  }

  test("sortDescending should sort a list of integers in descending order") {
    assert(Task2.sortDescending(List(1, 3, 2)) === List(3, 2, 1))
    assert(Task2.sortDescending(List(5, 4, 6, 1)) === List(6, 5, 4, 1))
    assert(Task2.sortDescending(List()) === List())
    assert(Task2.sortDescending(List(-1, -3, -2)) === List(-1, -2, -3)) 
  }

  test("makeAdder should return a function that adds x to its argument") {
    val add5 = Task3.makeAdder(5)
    assert(add5(3) === 8)
    assert(add5(0) === 5)
    assert(add5(-5) === 0)

    val add10 = Task3.makeAdder(10)
    assert(add10(5) === 15)
    assert(add10(-10) === 0)
  }

  test("makeAdder should handle boundary values correctly") {
    val addMaxInt = Task3.makeAdder(Int.MaxValue)
    assert(addMaxInt(0) === Int.MaxValue)
    assert(addMaxInt(-1) === Int.MaxValue - 1)

    val addMinInt = Task3.makeAdder(Int.MinValue)
    assert(addMinInt(0) === Int.MinValue)
    assert(addMinInt(1) === Int.MinValue + 1)
  }
}