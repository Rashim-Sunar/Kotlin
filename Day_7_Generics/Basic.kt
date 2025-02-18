/*
Generics in Kotlin allow you to write flexible, reusable, and type-safe code by working with generic types instead of specific ones. 
They enable type parameters that can be defined at compile-time, making your code more reusable and safer.Generics in Kotlin
allow you to write flexible, reusable, and type-safe code by working with generic types instead of specific ones. 
 They enable type parameters that can be defined at compile-time, making your code more reusable and safer.
 */

//  You can define a generic class using angle brackets <T>

// Here, T is a type parameter, and Box<T> can hold any data type.
class Box<T>(val value : T){
    fun returnValue() : T{
        return value;
    }
}

// ultiple Type Parameters
class pairBox<T, U>(val name : T,val age : U)

fun main() {
    val intBox = Box(10)
    val strBox = Box("Hello world")
    
    println(intBox.returnValue())  // 10
    println(strBox.returnValue())  // Hello world


    val p1 = pairBox("Aakash", 27)
    val p2 = pairBox("Bivek", "Twenty")
    
    println(p1.name)  // Aakash
    println(p1.age)   // 27
    println(p2.name)  // Bivek
    println(p2.age)   // Twenty
}