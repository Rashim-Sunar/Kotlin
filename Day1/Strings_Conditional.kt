fun main(args: Array<String>) {
  val str : String = "She see in the sea see"
  println(str.length)
  println(str.indexOf("see"))
  println(str.lastIndexOf("see"))
  println(str.toUpperCase())
  println(str.toLowerCase())
  println(str.reversed())
  
  
  val age : Byte = 10
  val res : String = if(age > 18) "Eligible for voting" else "Not eligible to vote"
  println(res)
  
  // "when" statement is used to choose one from many alternatives(similar to switch in C)
  val day : Int = 0
  val result : String = when(day){
    1 -> "Sunday"
    2 -> "Monday"
    3 -> "Tuesday"
    4 -> "Wednesday"
    5 -> "Thursday"
    6 -> "Friday"
    7 -> "Saturday"
    else -> "Invalid choice"
  }
  
  println(result)
  
}