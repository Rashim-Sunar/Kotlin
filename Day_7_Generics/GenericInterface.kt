interface Repository<T>{
    fun save(item : T)
    fun get() : T
}

class StringRepository : Repository<String>{
    private var data : String = "Default"
    
    override fun save(item : String){
        data = item
    }
    
    override fun get(): String{
        return data
    }
}

fun main() {
    val repo = StringRepository()
    repo.save("Hello world is the best word for programmers...")
    println(repo.get())
}