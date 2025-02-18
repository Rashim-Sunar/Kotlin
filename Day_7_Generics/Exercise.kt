fun main() {
    val basket1 = BasketballPlayer("Aakash")
    val basket2 = BasketballPlayer("Bivek")
    
    val foot1 = FootballPlayer("Aarav")
    val foot2 = FootballPlayer("Nabin")
    
    val footballTeam = Team("Football Team", mutableListOf(foot1))
    footballTeam.addPlayers(foot2) // Player: Nabin is added in the team Football Team
 // 	footballTeam.addPlayers(basket1)  // Argument type mismatch: actual type is 'BasketballPlayer', but 'FootballPlayer' was expected.
 
     val basketTeam = Team("Basketball Team", mutableListOf(basket1))
     basketTeam.addPlayers(basket2) // Player: Bivek is added in the team Basketball Team
    
 }
 
 class Team<T>(val name : String, val players : MutableList<T>){
     
     fun addPlayers(player : T){
         if(players.contains(player)){
             println("Player: ${(player as Player).name} is already in the team ${this.name}")
         }else{
             players.add(player)
             println("Player: ${(player as Player).name} is added in the team ${this.name}")
         }
     }
 }
 
 open class Player(val name : String)
 
 class FootballPlayer(name : String) : Player(name)
 class BasketballPlayer(name : String) : Player(name)