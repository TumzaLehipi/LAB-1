package bankaccount;


public class CheckingAccount extends BankAccount{
    
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;
    private double balance;
    
    public CheckingAccount(double initialBalance) //Constructor
    {   
        super(initialBalance);
        transactionCount = 0;
    }
   public void deposit(double amount){
        transactionCount++;
        super.deposit(amount);
   }
   public void withdraw(double amount){ //Overriden Method
        transactionCount++;
        super.withdraw(amount);
   }
   public void deductFees(){
    if (transactionCount > FREE_TRANSACTIONS)
    {
    double fees = TRANSACTION_FEE *
    (transactionCount - FREE_TRANSACTIONS);
    super.withdraw(fees);
    }
    transactionCount = 0;
    }  
   public double getBalance() // Method
    {
        return balance;
    }
    public void transfer(double amount, BankAccount other) //Method
    {
        withdraw(amount);
        other.deposit(amount);
    }

}
