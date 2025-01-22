
// In Kotlin, a singleton is a design pattern where a class has only one instance throughout the application.
//  Kotlin provides native support for implementing singletons using the object keyword.

// Lazy Initialization: The instance is created the first time it's accessed.
// No Explicit Constructor: You don't call a constructor; you access the object directly.

/* 
object DatabaseConnection {
    val url = "jdbc:mysql://localhost:3306/mydb"
    fun connect() {
        println("Connected to $url")
    }
}

fun main() {
    DatabaseConnection.connect() // No instance creation needed
    println(DatabaseConnection.url)
}

*/


// Singleton with State
/*
object Counter {
    private var count = 0
    fun increment() {
        count++
    }
    fun getCount() = count
}

fun main() {
    Counter.increment()
    Counter.increment()
    println(Counter.getCount()) // Output: 2
}
*/

//Singleton with Companion Object Alternative

class Database private constructor() {
    companion object {
        private var instance: Database? = null
        fun getInstance(): Database {
            if (instance == null) {
                instance = Database()
            }
            return instance!!
        }
    }
}

fun main() {
    val db1 = Database.getInstance()
    val db2 = Database.getInstance()
    println(db1 === db2) // Output: true (Both references point to the same instance)
}

