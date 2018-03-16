package bankaccount;

import java.util.Scanner;

/**
 * Class of savings accounts.
 */
public class SavingsAccount extends BankAccount{
     private double balance;
    
  public SavingsAccount(double rate) //Constructor
    {
    interestRate = rate;
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
    public void addInterest() // Added Method
    {
    double interest = getBalance() * interestRate / 100;
    deposit(interest);
    }
    private double interestRate; // Added instance field
    }
