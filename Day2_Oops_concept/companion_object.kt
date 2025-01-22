/*
In Kotlin, the companion object is a way to define static-like members 
(fields, methods, or properties) within a class. It allows you to create a singleton object associated with a class, 
and its members can be accessed using the class name without creating an instance of the class.
*/


fun main(args: Array<String>) {
    println(Calculator.msg)
    
    val sum : Int = Calculator.sum(10, 20)
    println(sum)
}
  
class Calculator{
    companion object{
      val msg : String = "This is companion attribute.."  
      fun sum(a : Int, b: Int) = a+b
    }
}