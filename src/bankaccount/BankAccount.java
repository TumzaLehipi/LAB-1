
package bankaccount;

import java.util.Scanner;

public class BankAccount {

    private double balance;
    private String accountName;
    
    public BankAccount() //Constructor
    {
        balance = 0;
    }
    public BankAccount(double initialBalance) //Parameter
    { //Constructor
        balance = initialBalance;
    }
    public void deposit(double amount) // Method
    {
        balance = balance + amount;
    }
    public void withdraw(double amount) // Method
    {
        balance = balance - amount;
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
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        CheckingAccount checkingAccount = new CheckingAccount(150);
        //BankAccount bankAccount = new BankAccount(3650);
        SavingsAccount savingsAccount = new SavingsAccount(0.5);
        
        int choice;
       
        System.out.println("Options");
        System.out.println("________");
        System.out.println("1- Deposit\n"
                + "2- Withdraw\n"
                + "3- Transfrer\n"
                + "________________\n"
                + "Select Choice");
        choice = input.nextInt();
        
        int amount;
                System.out.println("Enter money");
                 amount =input.nextInt();
        switch(choice){
            case 1:
            {
                
               
                savingsAccount.deposit(amount);
                
                System.out.println("Would you like to make other transaction?");
                System.out.println("1-Yes\n"
                        + "2- No\n");
                int choice1;
                choice1 =input.nextInt();
                if(choice1 == 1)
                {

                    System.out.println("Options");
                    System.out.println("________");
                    System.out.println("1-Deposit\n"
                            + "2- Withdraw\n"
                            + "Transfrer");
                    System.out.println("Select Choice\n"
                            + "_____________________");
                    choice = input.nextInt();
                 switch(choice)
                 {
                     case 1:
                     {
                         savingsAccount.deposit(amount);
                         break;
                     }
                     case 2:
                     {  
              
                         checkingAccount.withdraw(amount);
                         break;
                     }
                     case 3:
                     {
                         savingsAccount.transfer(amount, checkingAccount);
                         break;
                     }
                     
                 }
              
                            
                    
                }
                else
                {
                    break;
                }
                
                System.out.println("Mom's savings balance = $"
                + savingsAccount.getBalance());

            }
            case 2:
            {
                amount = input.nextInt();
                checkingAccount.withdraw(amount);
                System.out.println("Would you like to make other transaction?");
                System.out.println("Harry's checking balance = $"
                 +checkingAccount.getBalance());
                break;
            }
            case 3:
            {
                System.out.println("Enter the amount");
                amount = input.nextInt();
              savingsAccount.transfer(amount, checkingAccount);
              System.out.println("Harry's checking balance = $"
            +checkingAccount.getBalance());
           }
            
                
        }
     System.out.println("Mom's savings balance = $"
            + savingsAccount.getBalance());

      System.out.println("Harry's checking balance = $"
            +checkingAccount.getBalance());
    }
    
}
