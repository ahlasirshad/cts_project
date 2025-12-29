/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public abstract class BankAccount {

    private String accountNumber;
    private double balance;
    private String dateOpened;
    private String status;
    protected double interestRate;
    public abstract boolean withdraw(double amount);

    public BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.status = "ACTIVE";
    }

    
    // Encapsulation (Getters & Setters)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Common behaviors
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    

    public void transfer(BankAccount toAccount, double amount) {
        if (amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
        }
    }

    // Polymorphic method
    public abstract void calculateInterest();
}
