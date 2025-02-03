/* 
Kotlin supports delegation, which allows one class to delegate its functionality to another object. 
This helps in code reuse and composition over inheritance.
*/

/* 
1️⃣ Interface Delegation (by Keyword)
Kotlin provides the by keyword to delegate an interface’s implementation to another class.
*/

interface Printer {
    fun printMessage()
}

// Delegate class that provides implementation
class ConsolePrinter : Printer {
    override fun printMessage() {
        println("Printing to Console")
    }
}

// Class that delegates to ConsolePrinter
class Document(printer: Printer) : Printer by printer

fun main() {
    val doc = Document(ConsolePrinter())
    doc.printMessage()  // Output: Printing to Console
}


// ✅ The Document class inherits behavior from ConsolePrinter without re-implementing printMessage().


// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 

2️⃣ Property Delegation
Instead of writing custom getter and setter logic, we can delegate property values to built-in delegates like lazy or observable.

class LazyExample {
    val value: String by lazy {
        println("Computing value...")
        "Hello, Kotlin!"
    }
}

fun main() {
    val example = LazyExample()
    println(example.value) // "Computing value..." (only on first access)
    println(example.value) // Second time, directly returns the stored value
}

✅ lazy initializes the value only once when accessed for the first time.

*/  

/*
Example: observable Property Delegation

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("No Name") { _, old, new ->
        println("Name changed from $old to $new")
    }
}

fun main() {
    val user = User()
    user.name = "Aakash"  // Output: Name changed from No Name to Aakash
    user.name = "Bivek"   // Output: Name changed from Aakash to Bivek
}

*/

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
3️⃣ Custom Delegation
You can define custom delegates by implementing ReadOnlyProperty or ReadWriteProperty.


import kotlin.reflect.KProperty

class CustomDelegate {
    private var value: String = "Default"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Custom Value: $value"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("Value changed from $value to $newValue")
        value = newValue
    }
}

class Person {
    var name: String by CustomDelegate()
}

fun main() {
    val person = Person()
    println(person.name)  // Output: Custom Value: Default
    person.name = "Kotlin"  // Output: Value changed from Default to Kotlin
    person.name = "Node js" // Value changed from Kotlin to Node js
}

*/

/*
When to Use Delegation?
✅ Interface Delegation → When multiple classes share common logic.
✅ Property Delegation → To simplify lazy initialization, validation, and property observation.
✅ Custom Delegates → When you need custom behavior for property access.
*/
