package bankaccount;

public class InvestmentsAccount extends BankAccount{
    
    private double balance;
    private int accountNumber;
        
        
    public boolean withdraw(double withdrawAmount){
        
        if (withdrawAmount > balance){
            System.out.println("Insufficient Funds!!!");
            return false;
        } 
        else {
            balance += withdrawAmount;
            return true;
        }
    }
    public void deposit(double depositAmount){

        balance += depositAmount;
    }
    
  
}
