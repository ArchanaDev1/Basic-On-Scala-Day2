class Zoo {
  var animals: List[Animal] = List()
  def addAnimal(animal: Animal): Unit = {
    animals = animals :+ animal
  }

  def deleteAnimal(animal: Animal): Unit = {
    animals = animals.filterNot(_ == animal)
  }

  def showAnimals(): List[Animal] = {
    animals
  }

  def makeAllSpeak(): List[String] = {
    animals.map(_.speak())
  }
}
