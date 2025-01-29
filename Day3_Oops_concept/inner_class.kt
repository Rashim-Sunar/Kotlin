/* 
In Kotlin, an inner class is a nested class that has access to the members of its enclosing class, including private members. 
To declare an inner class, you use the inner keyword. Without the inner keyword, a nested class in Kotlin is static by default 
and cannot access the enclosing class's members.
*/

fun main(args: Array<String>) {
    val listView = ListView(arrayOf("Apple", "Mango", "Banana", "Grapes"))
    listView.ListViewItem().displayItems(1) //Mango \n  Outer name: Outer class
}


class ListView(val items : Array<String>){
  
  private val name : String = "Outer class"
  
  inner class ListViewItem(){
    fun displayItems(position : Int){
      println(items[position]) // Access to outer class member
      println("Outer name: ${this@ListView.name}") // Access outer class reference using this@outerclassName
    }
  }
}