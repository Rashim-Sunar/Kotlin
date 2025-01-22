fun main(args: Array<String>) {
    val p1 = Person("   Aakash", 20)
   p1.name = "   Bivek"
   p1.age = 30
    p1.info()
 }
 
 // creating class with the constructor
 class Person(name: String, var age: Int){
   var name : String = name.trim()
   fun info(){
     println("Hello I'm $name. I'm $age years old.")
   }
 }