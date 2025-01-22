//  Lazy initialization in Kotlin allows you to delay the initialization of a property until it is accessed for the first time. 
//  This is especially useful for properties whose initialization is resource-intensive or should be deferred until absolutely necessary.

// Immutable Property: It works only with val properties since the value is computed once and cannot change.

fun main() {
    
    val user1 = Person("Aakash", "Chaurasiya", 25)   // User Aakash is created
    val user2: Person by lazy{
        Person("Bivek", "Bhattrai", 20)    // init block code is not going to execute for this... The property is initialized only if accessed for first time
    }
    
    println(user2.fname)
    // Output:
    // User Bivek is created
    // Bivek
    
}

class Person(var fname: String, var lname: String, var age: Int){
    init{
        println("User ${this.fname} is created")
    }
}