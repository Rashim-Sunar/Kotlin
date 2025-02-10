// Plus (+) and Minus (-) with Collections

// Kotlin collections support + and - operators for adding/removing elements.

fun main(args : Array<String>){
    val list : List<String> = mutableListOf("one", "two", "three", "four")
    val newlist = list + "five"
    val newlist1 = list - mutableListOf("two", "three")
    println(newlist) //[one, two, three, four, five]
    println(newlist1) // [one, four]
}