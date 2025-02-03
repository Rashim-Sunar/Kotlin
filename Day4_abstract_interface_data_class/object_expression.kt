/*
In Kotlin, an object expression allows you to create anonymous classes (classes without a name) on the fly. 
This is useful when you need to create an instance of a class with minor modifications without explicitly defining a new subclass.
*/

interface OnClickListener {
    fun onClick()
}

class Button(val name: String, val id: Int, private val listener: OnClickListener) {
    fun click() { // Function to simulate a button click
        listener.onClick()
    }
}

fun main() {
    val signin = Button("login", 1234, object : OnClickListener {
        override fun onClick() {
            println("Logging in the user")
        }
    })

    val signout = Button("logout", 5678, object : OnClickListener {
        override fun onClick() {
            println("Logging out the user")
        }
    })

    // Simulating button clicks
    signin.click()  // Output: Logging in the user
    signout.click() // Output: Logging out the user
}

