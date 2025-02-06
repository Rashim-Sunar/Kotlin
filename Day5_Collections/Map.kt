fun main(args : Array<String>){
    var users = mutableMapOf<Int, String>(1 to "Aakash", 2 to "Bivek", 3 to "Aarav")
    users[4] = "Nabin"
    println(users) // {1=Aakash, 2=Bivek, 3=Aarav, 4=Nabin}
    users.remove(1) // pass the key as arguement
    println(users) // {2=Bivek, 3=Aarav, 4=Nabin}
    
    users.forEach{k, v -> 
      println("$k : $v")
    }
  }