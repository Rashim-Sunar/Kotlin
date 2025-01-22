/*In Kotlin, the lateinit keyword is used to declare a property that will be initialized later.
It is primarily used with mutable properties (var) that cannot be initialized at the time of declaration, 
but you are certain that they will be initialized before being accessed.*/

// Usage: Only applicable for var properties (not val).
// Type: Cannot be used with primitive types (e.g., Int, Double, etc.); it works with non-nullable reference types.
// Testing Initialization: You can check if a lateinit property has been initialized using ::propertyName.isInitialized.

fun main(args : Array<String>){
    val p1 = Person("Bivek" , 20)
    
    p1.favMovie = "3 Idiots"

    println(p1.favMovie)
}
  
class Person(var name : String, var age : Int){
    lateinit var favMovie : String 
}