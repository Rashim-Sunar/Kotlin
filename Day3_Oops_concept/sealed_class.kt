/*
In Kotlin, a sealed class is a special type of class that restricts inheritance to only a defined set of subclasses. 
It is used to represent restricted class hierarchies where a value can have one of the limited possible types.

You can have nested sealed classes.

Key Features of sealed class in Kotlin:
Restricts inheritance – Only subclasses defined inside the same file can inherit from it.
Exhaustive when-expressions – When used in a when expression, the compiler ensures all cases are handled.

sealed class can hold different types of data, while enum class only holds predefined constant values.
sealed class supports complex hierarchies and can contain properties, unlike enum class.

Use Cases:
Representing state management in UI (e.g., Loading, Success, Error states).
*/


fun main(args : Array<String>){
    val success = Result.Success("Passed!")
    val error = Result.Error("Failed!")
    
    getData(success) // Result: Passed!
    getData(error)   // Result: Failed!
}
  
fun getData(result : Result){
    when(result){
      is Result.Success -> result.showMessage()
      is Result.Error -> result.showMessage()
    }
}
  
  
sealed class Result(val message : String){
    fun showMessage(){
      println("Result: $message")
    }
    
    class Success(message : String) : Result(message)
    class Error(message : String) : Result(message)    
}