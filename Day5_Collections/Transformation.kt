/*

Zipping in Kotlin
In Kotlin, the zip() function is used to combine two collections into a list of pairs. It pairs elements from both collections based on their index positions.

// 1. Basic Usage of zip()
fun main() {
    val names = listOf("Alice", "Bob", "Charlie")
    val scores = listOf(90, 85, 95)

    val result = names.zip(scores) // Creates List of Pairs
    println(result) // [(Alice, 90), (Bob, 85), (Charlie, 95)]
}

// 2. Using zip() with a Transform Function
fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    val colors = listOf("Red", "Yellow", "Dark Red")

    val result = fruits.zip(colors) { fruit, color -> "$fruit is $color" }
    println(result) // [Apple is Red, Banana is Yellow, Cherry is Dark Red]
}



//4. Unzipping Pairs (unzip())
fun main() {
    val pairedList = listOf("Alice" to 90, "Bob" to 85, "Charlie" to 95)
    val (names, scores) = pairedList.unzip()

    println(names)  // [Alice, Bob, Charlie]
    println(scores) // [90, 85, 95]
}


// 5. Using zipWithNext()
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    println(numbers.zipWithNext()) 
    // [(1,2), (2,3), (3,4), (4,5)]
}

 */