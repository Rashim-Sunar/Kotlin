/*In Kotlin, the init keyword is used to define an initializer block,
which is a block of code that is executed immediately after the primary constructor of a class. 
It allows you to perform additional setup or initialization tasks when an object is created. */

fun main(args : Array<String>){
    val p1 = Person("Bivek", 20)
    p1.greet()
    
}
  
class Person(name : String, var age : Int){
    var name : String
    
    init{
      if(name.toLowerCase().startsWith('a')){
        this.name = name
      }else{
        this.name = "User"
      }
    }
    
    fun greet(){
      println("Hello I'm ${this.name}. I'm ${this.age} years old")
    }

}