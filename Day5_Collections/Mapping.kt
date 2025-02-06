/*

Mapping in Kotlin refers to transforming elements of a collection using the map and flatMap functions.
These functions apply a transformation to each element and return a new collection.

// 1. Basic map() Function
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    
    val squared = numbers.map { it * it } 
    println(squared) // [1, 4, 9, 16, 25]
}


// 2. Using mapIndexed():  If you need both index and value, use mapIndexed()
fun main() {
    val words = listOf("apple", "banana", "cherry")

    val result = words.mapIndexed { index, word -> "Word at index $index is $word" }
    println(result)
}
// [Word at index 0 is apple, Word at index 1 is banana, Word at index 2 is cherry]



// 3. mapNotNull() to Filter Null Values
// Use mapNotNull() to apply a transformation while removing null values.
fun main() {
    val numbers = listOf(1, 2, 3, null, 5)

    val doubled = numbers.mapNotNull { it?.times(2) } 
    println(doubled) // [2, 4, 6, 10]
}


// 4. Mapping a Map (mapKeys & mapValues)
// Kotlin allows mapping keys and values separately in a Map.
fun main() {
    val data = mapOf("A" to 1, "B" to 2, "C" to 3)

    val updatedKeys = data.mapKeys { it.key.lowercase() }
    println(updatedKeys) // {a=1, b=2, c=3}

    val updatedValues = data.mapValues { it.value * 10 }
    println(updatedValues) // {A=10, B=20, C=30}
}


// 5. flatMap() for Nested Lists
// flatMap() flattens nested lists while mapping.
fun main() {
    val numbers = listOf(1, 2, 3)

    val result = numbers.flatMap { listOf(it, it * 10) }
    println(result) // [1, 10, 2, 20, 3, 30]
}


// 6. flatten() to Convert List of Lists into a Single List
fun main() {
    val nestedList = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))

    val result = nestedList.flatten()
    println(result) // [1, 2, 3, 4, 5, 6]
}

*/
