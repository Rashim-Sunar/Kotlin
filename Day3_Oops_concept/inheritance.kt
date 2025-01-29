fun main(args : Array<String>){
    val car = Car("BMW", "Red", 1, 4)
    car.move()
    car.stop()
    car.changeGear(4)
}
  
open class Vehicle(val name : String, val color : String){
    //Without "open" the method is final and cannot be overriden...
    open fun move(){
      println("${this.name} is moving.")
    }
    
    fun stop(){
      println("${this.name} has stopped.")
    }
}
  
class Car(name : String, color : String, val engines : Int, val door : Int) : Vehicle(name, color){
    // Overriding method
    override fun move(){
      println("Car is moving.")
      super.move()
    }
    
    fun changeGear(gear : Int){
      println("Gear is changed to $gear")
    }
}