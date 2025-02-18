import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ValidateSpec extends AnyFlatSpec with Matchers {

  "Dog" should "speak Woof!" in {
    val dog = new Dog
    dog.speak() should be("speaking and Woof-woof!")
  }

  "Cat" should "speak Meow!" in {
    val cat = new Cat
    cat.speak() should be("speaking and Meow-meow!")
  }

  "Zoo" should "manage its collection of animals" in {
    val zoo = new Zoo

    val dog1 = new Dog
    val dog2 = new Dog
    val cat1 = new Cat
    val cat2 = new Cat

    zoo.addAnimal(dog1)
    zoo.addAnimal(dog2)
    zoo.addAnimal(cat1)
    zoo.addAnimal(cat2)

    val animals = zoo.showAnimals()
    animals should contain theSameElementsAs List(dog1, dog2, cat1, cat2)

    val sounds = zoo.makeAllSpeak()
    sounds should contain theSameElementsAs List(
      "speaking and Woof-woof!",
      "speaking and Woof-woof!",
      "speaking and Meow-meow!",
      "speaking and Meow-meow!"
    )

    zoo.deleteAnimal(dog1)
    val animalsAfterDeletion = zoo.showAnimals()
    animalsAfterDeletion should contain theSameElementsAs List(dog2, cat1, cat2)
  }
}
