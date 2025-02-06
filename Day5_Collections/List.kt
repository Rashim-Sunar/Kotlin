fun main(args: Array<String>) {

    // val names = listOf("Name1", "Name2", "Name3")  // Creates a immutable list...

    val names = mutableListOf<String>("Name1", "Name2", "Name3")
    
    println(names[0]) //Name1
    names.add("Name4")
    println(names)  //[Name1, Name2, Name3, Name4]
    
    names.set(0, "Name10")
    println(names)  // [Name10, Name2, Name3, Name4]
    
    names.removeAt(0)
    println(names) // [Name2, Name3, Name4]
    
    names.forEach{name -> println(name)}
}