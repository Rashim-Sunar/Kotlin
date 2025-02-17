// 1. Retrieving Elements by Index

// Using get() or [] Operator
fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)
    
    println(numbers.get(2))  // Output: 30
    println(numbers[2])      // Output: 30

    println(numbers.random()) // Retrieve a random number from the list

    println(numbers.getOrNull(5))  // Output: null  .... this avoids exception

    println(numbers.first())  // Output: 10
    println(numbers.last())   // Output: 50
    // If the list is empty, these methods throw NoSuchElementException.
    // Safe Versions: firstOrNull() and lastOrNull()


    // Retrieving Specific Parts of a Collection:  slice() – Extracting Specific Indices
    println(numbers.slice(1..3))    // Output: [20, 30, 40]
    println(numbers.slice(listOf(0, 2, 4)))  // Output: [10, 30, 50]

    val subNumbers = numbers.subList(1, 4)  // End index is exclusive
    println(subNumbers)  // Output: [20, 30, 40]


    // Taking and Dropping Elements
    println(numbers.take(3))  // Output: [10, 20, 30]   First n Elements
    println(numbers.takeLast(2))  // Output: [40, 50]   Last n Elements

    println(numbers.drop(3))  // Output: [4, 5]   Exclude First n Elements
    println(numbers.dropLast(2))  // Output: [1, 2, 3]    Exclude Last n Elements


    // The dropWhile function in Kotlin removes elements from the beginning of a collection until it finds the first element that does not match the given condition.

    val result = numbers.dropWhile { it < 30 }
    println(result)  // Output: [30, 40, 50]

    println(numbers.dropLastWhile { it > 30 })  // [10, 20, 30]

    println(numbers.takeLastWhile{ it > 30 })   // [40, 50]

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // chunked() Function in Kotlin
    // The chunked() function in Kotlin splits a collection or a string into smaller chunks of a specified size and returns a list of those chunks.
    val list: List<Int> = (0..13).toList()
    println(list.chunked(3))    // [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11], [12, 13]]
    println(list.chunked(3) { it.sum() })  // [3, 12, 21, 30, 25]

    val text : String = "HELLO WORLD"
    println(text.chunked(4))     // [HELL, O WO, RLD]
    println(text.chunked(4) {it.length})  // [4, 4, 3]


    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /* 🚀 windowed() Function in Kotlin
    The windowed() function in Kotlin creates sliding windows over a collection or a string. It returns a list of elements grouped into overlapping or non-overlapping windows.
    */
    println(numbers.windowed(3)) // [[10, 20, 30], [20, 30, 40], [30, 40, 50]]  The window slides by 1 step (default behavior).
    
    println(numbers.windowed(3, step = 2))  // [[10, 20, 30], [30, 40, 50]] The window slides by 2 step here... 
}
