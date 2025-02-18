// You can define generic functions that work with different types.

// Here, <T> before the function name declares that T is a generic type parameter.
fun <T> printItem( item : T){
    println(item)
}

fun main() {
    val list : List<Int> = listOf<Int>(10, 20, 30, 40, 50)
    printItem(100)   // 100
    printItem("Hello world")  // Hello world
    printItem(list)  // [10, 20, 30, 40, 50]
}