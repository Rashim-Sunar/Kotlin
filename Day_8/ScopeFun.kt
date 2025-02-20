/* 
🚀 Scope Functions in Kotlin
Scope functions in Kotlin (let, run, with, apply, and also) help in executing code within the context of an object. They make the code more concise, readable, and expressive.

In this scope, you can access the object without its name. Such functions are called scope functions.

🔹 Why Use Scope Functions?
Avoid unnecessary temporary variables.
Reduce boilerplate code.
Improve code readability and maintainability.
Useful for null safety handling.

✅ Kotlin Scope Functions Overview

    Function	Context Object	           Returns	                    Used For
       let	        it	                Lambda result	        Transformations, null safety
       run         	this	            Lambda result	        Object initialization and computations
       with	        this	            Lambda result	        Performing operations on an object
       apply	    this	            Object itself	        Object configuration (modifies object)
       also	        it	                Object itself	        Additional operations (logging, debugging)
*/



// 📌 1. let – Transformation & Null Safety

fun main() {
    val name: String? = "Kotlin"
    
    name?.let { 
        println("Length of '$it' is ${it.length}")  
    } 
}
/* 
✔ If name is not null, it executes the block.
✔ Returns the last expression inside the lambda.

🔹 Real Use Case: Chaining transformations

val result = "hello".let { it.uppercase() }.let { "Modified: $it" }
println(result)  // Output: Modified: HELLO

*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/* 
📌 2. run – Object Initialization & Computation
👉 Combines let + apply (executes a block & returns a result).

kotlin
Copy
Edit
fun main() {
    val message = "Kotlin is awesome!".run {
        println("Processing message: $this")
        this.uppercase()
    }
    println(message)  // Output: KOTLIN IS AWESOME!
}
✔ Executes operations on an object and returns the result.
✔ this is the context object.

🔹 Real Use Case: Creating objects without temporary variables

val user = run {
    val name = "Rashim"
    val age = 24
    "User: $name, Age: $age"
}
println(user)  // Output: User: Rashim, Age: 24

*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
📌 3. with – Perform Operations on an Object
👉 Used when you want to perform multiple operations on the same object.

fun main() {
    val person = Person("Rashim", 24)

    with(person) {
        println("Name: $name")
        println("Age: $age")
    }
}

data class Person(val name: String, val age: Int)
✔ Returns the result of the lambda.
✔ this is the context object.
✔ Used for grouping operations on an object.
*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/* 
📌 4. apply – Configure an Object (Returns Object)
👉 Used to initialize an object and modify its properties.

fun main() {
    val user = User().apply {
        name = "Rashim"
        age = 24
    }
    println(user)  // Output: User(name=Rashim, age=24)
}

data class User(var name: String = "", var age: Int = 0)
✔ Modifies the object and returns the object itself.
✔ this is the context object.
✔ Used in object initialization (like builders).
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
📌 5. also – Perform Additional Operations
👉 Used when you want to execute extra operations like logging or debugging.

fun main() {
    val user = User("Rashim", 24).also {
        println("User created: $it")
    }
}
✔ Returns the original object (it).
✔ Does not modify the object (useful for side effects).
✔ Used for logging, debugging, or validations.
*/

