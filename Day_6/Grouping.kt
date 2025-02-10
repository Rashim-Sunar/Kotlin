// In Kotlin, grouping allows you to classify elements of a collection based on a given key. The most common way to do this is using the groupBy function.
/* 
fun main(args : Array<String>){
    val numbers : List<String> = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy { it.first().toUpperCase() })  // {O=[one], T=[two, three], F=[four, five]}
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = { it.toUpperCase() })) // {o=[ONE], t=[TWO, THREE], f=[FOUR, FIVE]}
}
*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2. Using groupingBy for Advanced Grouping
/* 
fun main() {
    val words = listOf("apple", "banana", "apple", "cherry", "banana", "apple")

    val wordCount = words.groupingBy { it }.eachCount()
    println(wordCount) // {apple=3, banana=2, cherry=1}

}
*/

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

//3. Grouping with Custom Objects

data class Employee(val name: String, val department: String)

fun main() {
    val employees = listOf(
        Employee("Alice", "HR"),
        Employee("Bob", "IT"),
        Employee("Charlie", "IT"),
        Employee("David", "Finance"),
        Employee("Eve", "HR")
    )

    val groupedByDepartment = employees.groupBy { it.department }
    println(groupedByDepartment)
    // {HR=[Employee(name=Alice, department=HR), Employee(name=Eve, department=HR)], IT=[Employee(name=Bob, department=IT), Employee(name=Charlie, department=IT)], Finance=[Employee(name=David, department=Finance)]}
}
