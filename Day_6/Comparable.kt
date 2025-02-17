/*
1. Comparable Interface
It is used when an object has a natural ordering.
The class itself implements Comparable<T> and overrides the compareTo() method.
*/


fun main(args : Array<String>){
    val list : List<Person> = mutableListOf<Person>(
    	Person("Bivek", 20),
        Person("Aarav", 24),
        Person("Aakash", 23)
    )
    
    println(list.sorted())
}

data class Person(val name: String, val age: Int) : Comparable<Person>{
    override fun compareTo(other : Person) : Int{
        if(this.age > other.age){
            println("No swapping ${this} and ${other}")
            return 1; // // 'this' is greater → should come AFTER 'other'
        }else if(this.age < other.age){
            println("Swapping ${this} with ${other}")
            return -1;    // 'this' is smaller → should come BEFORE 'other'

        }else{
            return 0;   // Equal, no change
        }
    }
}
/* 
Output: 

No swapping Person(name=Aarav, age=24) and Person(name=Bivek, age=20)
Swapping Person(name=Aakash, age=23) with Person(name=Aarav, age=24)
Swapping Person(name=Aakash, age=23) with Person(name=Aarav, age=24)
No swapping Person(name=Aakash, age=23) and Person(name=Bivek, age=20)
[Person(name=Bivek, age=20), Person(name=Aakash, age=23), Person(name=Aarav, age=24)]
*/