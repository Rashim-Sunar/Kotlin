fun main(args: Array<String>) {
  
    val button = Button("signin", "center")
    button.draw()
    /* Output:
        Drawing the button
        Drawing the view
    */
    
      val rb = RoundButton("signup", "center", 10)
      rb.draw()
      /*  Output:
          Drawing the round button
          Drawing the button
          Drawing the view
      */
}
  
open class View(){
    open fun draw(){
      println("Drawing the view")
    }
}
  
open class Button(val text : String, val orientation : String) : View(){
   
    override fun draw(){
      // Specific code to draw the button... 
      println("Drawing the button")
      super.draw()
    }
}
  
class RoundButton(text : String, orientation : String, val radius : Int) : Button(text, orientation){
    
    override fun draw(){
      // Code to draw the round button.....
      println("Drawing the round button")
      super.draw()
    }
  }