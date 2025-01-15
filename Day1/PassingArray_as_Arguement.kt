fun main(args : Array<String>){
    print(sum(10,20,30,40,50))
}

fun sum(vararg numbers : Int) : Int {
    var s : Int = 0
    for(number in numbers) s += number
}