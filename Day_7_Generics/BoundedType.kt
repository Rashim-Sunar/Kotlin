// You can restrict a generic type to a specific type or its subtypes using :

fun main() {
    println(add(10, 20))
    println(add(10.30, 20.34))
    println(add("Hello", "World")) //❌ ERROR! Only Number types allowed
}

fun <T : Number> add(a : T, b : T) : T{
    return (a.toDouble() + b.toDouble()) as T
}

// Here, <T : Number> ensures that only Number and its subclasses (Int, Double, Float, etc.) are allowed.