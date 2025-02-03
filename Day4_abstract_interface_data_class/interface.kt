/* 
Key Features of Interfaces in Kotlin:
✅ Can contain both abstract and default methods, but no constructors.
✅ A class can implement multiple interfaces
✅ Cannot store state (no instance variables)

*/

interface Animal{
    fun sound()   // Abstract method
    
    fun sleep(){
      println("Sleeping...") // Default implementation
    }
}
  
class Dog(val name : String) : Animal{
    override fun sound(){
      println("$name is barking")
    }
}
  
fun main(args: Array<String>) {
      val dog = Dog("Jonny")
      dog.sound()  // Jonny is barking
      dog.sleep()  // Sleeping...
}