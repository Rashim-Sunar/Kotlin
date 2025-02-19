/*
Reified Type Parameters (reified) in Inline Functions
Normally, generic types are erased at runtime (type erasure). But reified allows us to retain the generic type at runtime.
*/

/* 
inline fun <reified T> isType(value: Any): Boolean {
    return value is T
}

fun main() {
    println(isType<String>("Hello")) // true
    println(isType<Int>("Hello"))    // false
}
*/

// Without reified, T would be erased at runtime.
// With reified, we can check the type at runtime.



// A program to get specific data from the mixed list
fun main() {
    val mixedList = mutableListOf(1,2,3,'a', 'b','c',"Hello", "World")
    
    val specificList : List<Char> = getSpecificList<Char>(mixedList)
    
    for(element : Char in specificList){
        print("$element, ")    // a, b, c, 
    }
}

inline fun <reified T> getSpecificList(list : List<Any>) : List<T>{
    val specificList : MutableList<T> = mutableListOf<T>()
    
    for(element : Any in list){
        if(element is T){
            specificList.add(element)
        }
    }
    
    return specificList
}