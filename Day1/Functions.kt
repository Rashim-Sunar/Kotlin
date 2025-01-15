fun main(args: Array<String>) {
    val s : Int = sum(10,20)
    println(s)
    
    val msg : String = getMessage("Aakash", 20)
    println(msg)
    
    val large : Int = getMax(10, 50)
    println(large)
}

fun sum(a : Int, b : Int) = a + b

fun getMax (a : Int, b : Int) = if( a > b ) a else b

fun getMessage(name : String, age : Int) : String {
  return "My name is $name. I'm $age years old"
}