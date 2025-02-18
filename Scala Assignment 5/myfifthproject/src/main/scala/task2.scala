object Task2 {
  val sortDescending: List[Int] => List[Int] = (list: List[Int]) => list.sortWith(_ > _)
}