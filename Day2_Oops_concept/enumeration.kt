/*
In Kotlin, an enum (enumeration) is a special class used to define a set of constant values,
making it a perfect fit for representing predefined options or states. 
Each constant in an enum is an object, and enums can have properties, methods, and even implement interfaces.
*/

// Type-Safe: Each value is strongly typed.
// Constructors: Enums can have constructors to initialize their properties.

// Syntax....
/*
enum class EnumName {
    CONSTANT1, CONSTANT2, CONSTANT3
}
*/

//----------------------------------------------------------------------------------------------------------------------

//Basic Enum
/* 
fun main(args: Array<String>){
    val today = Day.Wednesday
    println(today) //Wednesday
    
    for(day in Day.values()){   //Iterating through enum values.... 
        println(day)
    }
}

enum class Day{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
*/

//--------------------------------------------------------------------------------------------------------------------------

// Enum with Properties and Methods
/* 
fun main(args : Array<String>){
    val dir = Direction.EAST
    println(dir.distance) // 80
    println(dir.direction) // east
    println(dir.name) //EAST
    
    dir.printData()  // Direction = east & Distance = east
}

enum class Direction(var direction : String, var distance : Int){
    NORTH("north", 100),
    SOUTH("south", 20),
    EAST("east", 80),
    WEST("west", 30);
    
    fun printData(){
        println("Direction = ${this.direction} & Distance = ${this.direction}")
    }
}
*/

//---------------------------------------------------------------------------------------------------------------------------------------

// Enum with Interface

interface Direction {
    fun move()
}

enum class CompassDirection : Direction {
    NORTH {
        override fun move() = println("Moving north")
    },
    SOUTH {
        override fun move() = println("Moving south")
    },
    EAST {
        override fun move() = println("Moving east")
    },
    WEST {
        override fun move() = println("Moving west")
    }
}

fun main() {
    val direction = CompassDirection.NORTH
    direction.move() // Output: Moving north
}

/*
Enum Functions:
.values(): Returns an array of all enum constants.
.valueOf(name: String): Returns the enum constant with the specified name.
.ordinal: Returns the index (starting at 0) of the enum constant.
.name: Returns the name of the enum constant as a string.
*/