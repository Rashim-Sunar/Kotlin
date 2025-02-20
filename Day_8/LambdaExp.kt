// A lambda function (or lambda expression) in Kotlin is an anonymous function that can be stored in a variable, passed as an argument, or returned from another function.

/* 
🔹 Basic Syntax
val lambdaName: (ParameterType) -> ReturnType = { parameters -> functionBody }
*/


/* 
Example 1: Lambda Without Explicit Types

val add: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

fun main() {
    println(add(5, 3))  // Output: 8
}

*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Example 2: Lambda as a Function Parameter (Higher-Order Function)

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = operateOnNumbers(5, 3) { x, y -> x + y }
    val product = operateOnNumbers(5, 3) { x, y -> x * y }
    
    println("Sum: $sum")         // Output: Sum: 8
    println("Product: $product") // Output: Product: 15
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
// Example 3: Lambda with it (Single Parameter

val square: (Int) -> Int = { it * it }

fun main() {
    println(square(4))  // Output: 16
}
*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// Example 4: Lambda Returning Another Lambda
/* 
fun multiplyBy(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}

fun main() {
    val double = multiplyBy(2)
    val triple = multiplyBy(3)

    println(double(5))  // Output: 10
    println(triple(5))  // Output: 15
}
*/
