/* 
2. Comparator Interface
It is used when we want different ways to compare objects.
We define separate Comparator implementations instead of modifying the class.
The compare() function returns:
0 if both objects are equal
A positive number if the first object is greater
A negative number if the first object is smaller
*/

data class Person(val name: String, val age: Int)

val ageComparator = Comparator<Person> { p1, p2 -> p1.age - p2.age }
val nameComparator = Comparator<Person> { p1, p2 -> p1.name.compareTo(p2.name) }

fun main() {
    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 22)
    )

    val sortedByAge = people.sortedWith(ageComparator)
    val sortedByName = people.sortedWith(nameComparator)

    println("Sorted by age: $sortedByAge")
    println("Sorted by name: $sortedByName")


    println(people.sortedBy {it.age}) // Internally implements comparator interface

    println(people.sortedWith( compareBy<Person>{ it.age }.thenBy{ it.name })) // Sequential way of sorting with multiple properties
}

// Output: 
// Sorted by age: [Person(name=Charlie, age=22), Person(name=Alice, age=25), Person(name=Bob, age=30)]
// Sorted by name: [Person(name=Alice, age=25), Person(name=Bob, age=30), Person(name=Charlie, age=22)]
// [Person(name=Charlie, age=22), Person(name=Alice, age=25), Person(name=Bob, age=30)]