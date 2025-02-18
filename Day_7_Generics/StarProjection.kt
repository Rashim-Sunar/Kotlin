/*
Star Projection (*)
Sometimes, you don't know the exact type. Kotlin provides star projection (*) to work with unknown types.
*/

fun printList(list: List<*>) {
    for (item in list) {
        println(item)
    }
}

fun main() {
    val intList = listOf(1, 2, 3)
    val stringList = listOf("A", "B", "C")

    printList(intList)    // 1, 2, 3
    printList(stringList) // A, B, C
}
