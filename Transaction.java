<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Transaction {

    private String transactionId;
    private String transactionType;
    private double amount;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    public Transaction(String transactionId, String transactionType,
                       double amount, BankAccount from, BankAccount to) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = from;
        this.toAccount = to;
    }

    public void execute() {
        if (transactionType.equalsIgnoreCase("TRANSFER")) {
            fromAccount.transfer(toAccount, amount);
            System.out.println("Transaction Successful");
        }
    }

    public void rollback() {
        System.out.println("Transaction Rolled Back");
    }
}

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Transaction {

    private String transactionId;
    private String transactionType;
    private double amount;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    public Transaction(String transactionId, String transactionType,
                       double amount, BankAccount from, BankAccount to) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = from;
        this.toAccount = to;
    }

    public void execute() {
        if (transactionType.equalsIgnoreCase("TRANSFER")) {
            fromAccount.transfer(toAccount, amount);
            System.out.println("Transaction Successful");
        }
    }

    public void rollback() {
        System.out.println("Transaction Rolled Back");
    }
}

>>>>>>> c0e59ef2047b8890d2bbd5253a5b09108b694b8a
