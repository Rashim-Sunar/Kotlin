/*
In Kotlin, an abstract class is a class that cannot be instantiated directly and is meant to be subclassed. 
It can contain both abstract and concrete methods. Abstract methods do not have an implementation and must be overridden by subclasses.
*/

abstract class Animal(val name: String) {
    abstract fun makeSound() // Abstract method (must be overridden)
    
    fun displayInfo() { // Concrete method (optional to override)
        println("Animal name: $name")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Bark! Bark!")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.displayInfo()
    dog.makeSound()
}
