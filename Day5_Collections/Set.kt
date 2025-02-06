fun main(args : Array<String>){
    val names = mutableSetOf("Name1", "Name2", "Name3", "Name1")
    println(names)  // [Name1, Name2, Name3]
    
    val users = mutableSetOf<User>(User("user1", 20), User("user2", 30), User("user3", 40), User("user1", 20))
    println(users)
    // [User(name=user1, age=20), User(name=user2, age=30), User(name=user3, age=40)] For this we have to m ake the class as a data class otherwise it will treat above four objects as distinct though the values are same
  

    users.forEach{user -> 
      println("Name: ${user.name} \t Age:${user.age}")
    }
}
  
data class User(var name: String, var age: Int)