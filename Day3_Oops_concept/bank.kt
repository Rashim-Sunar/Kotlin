fun main(args : Array<String>){
    val aakashAccount = Account("Aakash")
    aakashAccount.deposit(1000)
    aakashAccount.withdraw(500)
    
    println("Balance is ${aakashAccount.calculateBalance()}")
    
  }
  
  class Account(val accountHolder : String){
    private var balance = 0
    var transaction = mutableListOf<Int>()
    
    fun deposit(amount : Int){
      if(amount > 0){
        this.balance += amount
        transaction.add(amount)
        println("$amount deposited. Your balance is now ${this.balance}.")
      }else{
        println("Cannot deposit negative amounts!")
      }
    }
    
    fun withdraw(withdrawl : Int){
      if(-withdrawl < 0){
        if(this.balance > withdrawl){
          this.balance += -withdrawl
          transaction.add(-withdrawl)
          println("$withdrawl withdrawn successfully. Your balance is now ${this.balance}.")
        }else{
          println("Sorry! You don't have enough balance to withdraw. Your current balance is ${this.balance}")
        }
      }else{
        println("Negative amount can't be withdrawn!")
      }
    }
    
    fun calculateBalance() : Int{
      this.balance = 0
      for(amount in transaction){
        this.balance += amount
      }
      return this.balance
    }
  }