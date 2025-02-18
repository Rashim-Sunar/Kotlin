/*
Reified Type Parameters (reified) in Inline Functions
Normally, generic types are erased at runtime (type erasure). But reified allows us to retain the generic type at runtime.
*/

inline fun <reified T> isType(value: Any): Boolean {
    return value is T
}

fun main() {
    println(isType<String>("Hello")) // true
    println(isType<Int>("Hello"))    // false
}

// Without reified, T would be erased at runtime.
// With reified, we can check the type at runtime.