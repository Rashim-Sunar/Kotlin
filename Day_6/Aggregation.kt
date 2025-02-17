/*
✅ sum() → Sums elements
✅ average() → Gets the mean
✅ minOrNull(), maxOrNull() → Find min/max
✅ count { } → Counts matching elements
✅ reduce() → Accumulates without initial value
✅ fold(initialValue) → Accumulates with initial value
✅ groupingBy().eachCount() → Counts occurrences
*/



fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Sum: ${numbers.sum()}")          // Output: 150
    println("Average: ${numbers.average()}")  // Output: 30.0
    println("Min: ${numbers.minOrNull()}")    // Output: 10
    println("Max: ${numbers.maxOrNull()}")    // Output: 50

    val numbers2 = listOf(5, 10, 15, 20, 25)
    println("Total count: ${numbers2.count()}")  // Output: 5
    println("Count > 10: ${numbers2.count { it > 10 }}")  // Output: 3

    val numbers3 = listOf(1, 2, 3, 4, 5)
    val sum = numbers3.reduce { acc, num -> acc + num }  // ✔ The first element is used as the initial accumulator.
    println("Reduced sum: $sum")  // Output: 15   

    val sum = numbers.fold(10) { acc, num -> acc + num } // ✔ Unlike reduce(), fold() takes an initial value (10 here).
    println("Folded sum: $sum")  // Output: 25

    // groupingBy() & eachCount() – Frequency Count
    val words = listOf("apple", "banana", "apple", "orange", "banana", "banana")

    val frequency = words.groupingBy { it }.eachCount()
    println(frequency)  // Output: {apple=2, banana=3, orange=1}
}
