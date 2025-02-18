// Variance in Generics

// Kotlin provides invariance, covariance (out), and contravariance (in) to control how generics behave in class hierarchies.

/*1... Contravariant (in) – Consumer

Use in when the generic type is only accepted as an input.
Works like ? super in Java (only allows modifying, not reading).

interface Consumer<in T> {  // Contravariant: can accept T but cannot return T
    fun consume(item: T)
}

class Printer : Consumer<String> {
    override fun consume(item: String) {
        println("Printing: $item")
    }
}

fun main() {
    val stringPrinter: Consumer<String> = Printer()
    stringPrinter.consume("Hello World")  // Printing: Hello World
}

// You cannot return T from functions inside the class.
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
Covariant (out) – Producer
Use out when the generic type is only returned (produced).
Works like ? extends in Java (only allows reading, not modifying).
*/

// Define the Fruit class
class Fruit(val name: String)

interface Producer<out T> {  // Covariant: can return T but cannot take T as input
    fun produce(): T
}

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit = Fruit("Apple")  // Now this works!
}

fun main() {
    val fruitProducer: Producer<Fruit> = FruitProducer()
    println(fruitProducer.produce().name)  // Output: Apple
}
