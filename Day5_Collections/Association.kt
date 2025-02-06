/*Association in Kotlin refers to mapping elements of a collection to keys or values in a Map. 
Kotlin provides associate, associateBy, and associateWith functions for this purpose.

// 1. Using associate() : ransforms a collection into a Map by generating both keys and values.
fun main() {
    val words = listOf("apple", "banana", "cherry")

    val result = words.associate { word -> word to word.length }
    println(result) // {apple=5, banana=6, cherry=6}
}


//  2. Using associateBy() :  creates a Map where keys are derived from elements, and values remain unchanged.
fun main() {
    val words = listOf("apple", "banana", "cherry")

    val result = words.associateBy { it.first() }
    println(result) // {a=apple, b=banana, c=cherry}
}
// 🔹 The first letter of each word is used as the key.
// ✅ Keys must be unique—if duplicates exist, only the last occurrence is stored.
fun main() {
    val names = listOf("Alice", "Anna", "Bob")

    val result = names.associateBy { it.first() }
    println(result) // {A=Anna, B=Bob}
}



// 3. Using associateWith() : creates a Map where keys are elements, and values are derived.
fun main() {
    val words = listOf("apple", "banana", "cherry")

    val result = words.associateWith { it.length }
    println(result) // {apple=5, banana=6, cherry=6}
}

*/


// 4. Combining associateBy() and associateWith()
fun main() {
    val words = listOf("apple", "banana", "cherry")

    val result = words.associateBy({ it.first() }, { it.length })
    println(result) // {a=5, b=6, c=6}
}
//  🔹 The first letter is the key, and the word length is the value.