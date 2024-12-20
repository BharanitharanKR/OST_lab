class Bankaccount{
    var depositorname:String=" "
        var accountnumber:String=" "
            var accounttype:String=" "
                var balance:Double=0.0

}
def assignvalues(name:String,accnum:String,accType:String,InitialBalance:Double):Unit={
    depositorname=name
     accountnumber=accnum
     accounttype=accType
             balance=initialBalance
}
def deposit(amount:Double):Unit={
    if(amount>0){
        balance++amountprintln(s"Deposited:$$${amount},New Balance:$$${balance}")
    }else
    {
        println("Deposit amount must be greater than 0")
    }}
    
def withdraw(amount:Double):Unit={
    if(amount>0){
        if (balance >=amount){
            balance<=amount
            println(s"withdraw:$$${amount},newbalance:$$${balance}")
        }
        else{
            println("Insufficient")
        }
        else{
            println("withdrawal amt must be greater )
        }
    }
}
def displayDetails(0):Unit={
    println(s"depositor Name :$depositor Name")
    println(s"Account Number :$accountNumber")
    println(s"Account Type :$accountType")
    println(s"current Balance :$$${balance} %.2f)
}
object BankAccountTest{
    def main(args:Array[String]):Unit={
        val myAccount=new BankAccount()
        myAccount.assignvalues("john","1234","saving",10000.0)
        myaccount.displayDetails()
        myaccount.deposit(500.)
        myAccount.withdraw(300.0)
        myAccount.withdraw(2000.0)
        myAccount.displayDetails()
    }
}