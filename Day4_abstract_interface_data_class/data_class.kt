/*
In Kotlin, a data class is a special type of class designed to hold data. 
It automatically provides useful methods such as toString(), equals(), hashCode(), and copy() 
without needing to define them manually.

Key Features:
✅ Auto-generated toString(), equals(), hashCode(), and copy()
✅ Uses componentN() functions for destructuring
✅ Ideal for modeling immutable data
*/


data class User(val name : String, val age : Int)

fun main(args : Array<String>){
  val user1 = User("Rashim", 21)  // User(name=Rashim, age=21)
  val user2 = User("Rashim", 21)  // User(name=Rashim, age=21)
  println(user1)
  println(user2)
  
  // // Checking equality
  println(user1 == user2) //true  Note: If the class is not data class then then output is false
  
  // // Copying with modification
  val user3 = user1.copy(age = 20)
  println(user3)  // User(name=Rashim, age=20)
  
  //  // Destructuring declaration
  val (name, age) = user1
  println("Name: $name  Age: $age")  // Name: Rashim  Age: 21
  
  
  println(user1.hashCode())  // -1647674355
  println(user2.hashCode())  // -1647674355
  println(user3.hashCode())  // -1647674356
}