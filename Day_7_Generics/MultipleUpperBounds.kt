// In Kotlin, multiple upper bounds allow a generic type parameter to be constrained by more than one type.
 
/* 
Syntax
fun <T> exampleFunction(item: T) where T : SuperType1, T : SuperType2 {
     // Function body
}
The first bound must be a class (if present), others must be interfaces.
*/


// ✅ Example: Multiple Upper Bounds with a Class and an Interface
// Define a class and an interface
open class Animal(val name: String)

interface Walker {
    fun walk()
}

// Use multiple upper bounds
fun <T> moveAnimal(animal: T) where T : Animal, T : Walker {
    println("${animal.name} is moving!")
    animal.walk()
}

// Create a subclass that satisfies both constraints
class Dog(name: String) : Animal(name), Walker {
    override fun walk() {
        println("$name is walking on four legs.")
    }
}

fun main() {
    val dog = Dog("Buddy")
    moveAnimal(dog)  
}

/*
❌ Incorrect Example (Fails)
kotlin
Copy
Edit
fun <T> invalidExample(item: T) where T : String, T : Number {
    // ❌ ERROR: A type can’t inherit from both String and Number (both are classes)
}
💡 Why?
Kotlin allows only one class as an upper bound.
Interfaces can be combined, but multiple classes cannot.
*/

//-------------------------------------------------------------------------------------------------------------------------

// ✅ Multiple Interface Upper Bounds
/*
interface Painter {
    fun paint()
}

interface Singer {
    fun sing()
}

fun <T> perform(item: T) where T : Painter, T : Singer {
    item.paint()
    item.sing()
}

// Implement both interfaces
class Artist : Painter, Singer {
    override fun paint() = println("Painting a masterpiece.")
    override fun sing() = println("Singing a song.")
}

fun main() {
    val artist = Artist()
    perform(artist)  // ✅ Works!
}
*/

/* 
💡 Key Takeaways
✔ Only one class can be an upper bound.
✔ Multiple interfaces can be used as upper bounds.
✔ Use where to declare multiple upper bounds.
*/
