/* 
In Kotlin, predicates are functions that return a boolean value (Boolean). 
They are commonly used in functional programming with higher-order functions like filter, any, all, and none.
*/

// 1.  Using Predicate with Higher-Order Functions

/* 
//  Using filter()
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)  // Output: [2, 4, 6]
}
*/

/* 
// Using all(), any(), and none()
fun main() {
    val numbers = listOf(2, 4, 6, 8)

    println(numbers.all { it % 2 == 0 })  // true (all numbers are even)
    println(numbers.any { it > 5 })       // true (some numbers are greater than 5)
    println(numbers.none { it < 0 })      // true (no negative numbers)
}
*/


// 2. Predicate as a Parameter

fun filterNumbers(numbers: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    return numbers.filter(predicate)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    
    val evens = filterNumbers(numbers) { it % 2 == 0 }
    println(evens)  // Output: [2, 4, 6]

    val greaterThanThree = filterNumbers(numbers) { it > 3 }
    println(greaterThanThree)  // Output: [4, 5, 6]
}

