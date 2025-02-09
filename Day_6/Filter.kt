/* 
Filtering in Kotlin is primarily done using the filter function, which is available for collections such as lists, sets, and sequences.
It allows you to create a new collection containing only the elements that satisfy a given predicate.
*/

fun main(args : Array<String>){
    val numbers: List<String> = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter{ it.length > 3}
    println(longerThan3) // [three, four] 
    
    // Filtering by Index using filterIndexed
    val filteredInd: List<String> = numbers.filterIndexed{index, value -> (index != 0) && (value.length < 5)}
    println(filteredInd) // [two, four]
    
    // Filtering with filterNot
    val filteredNot = numbers.filterNot{ it.length <= 3}
    println(filteredNot) // three, four]
    
    // Filtering Maps
    val numbersMap: Map<String, Int> = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key101" to 101)
    val filteredMap: Map<String, Int> = numbersMap.filter{ it.key.endsWith("1") && it.value > 100}
    println(filteredMap) // {key101=101}


    val mixedList = listOf(1,2,3, 'A', 'B', 'C', "Hello world", "Aakash", false)
    mixedList.filterIsInstance<String>().forEach{
     print("$it ") // Hello world Aakash 
    }
    
    println()
  
    mixedList.filterIsInstance<Char>().forEach{
      print("$it ") //  A B C
    }
  
    println()
  
    mixedList.filterIsInstance<Int>().forEach{
      print("$it ") // 1 2 3 
    }
  
    println()
  
    mixedList.filterIsInstance<Boolean>().forEach{
       print("$it ") // false 
    }

     // PARTITION.....
    val (match : List<String>, rest : List<String>) = numbers.partition{it.length > 3} 
    println(match) // // [three, four]
    println(rest) // [one, two]
}