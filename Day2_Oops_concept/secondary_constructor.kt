// Secondary constructor in kotlin is used for constructor overloading.. 

fun main(args : Array<String>){
    val p1 = Person("Bivek")
    p1.greet()
    
}
  
class Person(var name : String, var age : Int){
    
    // Calling primary constructor from secondary constructor using 'this' keyword
    constructor(name : String) : this(name, 0){
      println("Secondary constructor called!")
    }
  
    fun greet(){
      println("Hello, I'm ${this.name}. I'm ${this.age} years old.")
    }
}