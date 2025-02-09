fun main(args: Array<String>){
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings) // [one, two, three, four]
     println(numbersStrings.joinToString()) // one, two, three, four
     
     val listString = StringBuffer("The list of numbers: ")
     println(numbersStrings.joinTo(listString)) //The list of numbers: one, two, three, four
     
     println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = " :end")) // start: one | two | three | four :end
  
    val numbers : List<Int> = (1..100).toList()
    println(numbers.joinToString(limit = 10, truncated = "<...>")) // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, <...>
    
    println(numbersStrings.joinToString { "Element: ${it}"}) // Element: one, Element: two, Element: three, Element: four
  }