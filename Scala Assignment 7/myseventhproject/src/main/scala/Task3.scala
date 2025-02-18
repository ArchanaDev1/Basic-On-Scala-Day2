class Animal{
  def speak(): String={
    return "speaking"
  }
} 

//dog class
class Dog extends Animal{
  override def speak(): String={
    val baseSpeak = super.speak() 
    s"$baseSpeak and Woof-woof!"
  }

}
//cat class
class Cat extends Animal{
  override def speak(): String={
   val baseSpeak = super.speak() 
    s"$baseSpeak and Meow-meow!"
  }
}