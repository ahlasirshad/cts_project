<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA001", 5000, 5, 1000);
        BankAccount acc2 = new CurrentAccount("CA001", 3000, 2000, 50);
        
        acc1.calculateInterest();   // SavingsAccount method
        acc2.calculateInterest();   // CurrentAccount method

        acc1.transfer(acc2, 1000);

        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());
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
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA001", 5000, 5, 1000);
        BankAccount acc2 = new CurrentAccount("CA001", 3000, 2000, 50);
        
        acc1.calculateInterest();   // SavingsAccount method
        acc2.calculateInterest();   // CurrentAccount method

        acc1.transfer(acc2, 1000);

        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());
    }
}

>>>>>>> c0e59ef2047b8890d2bbd5253a5b09108b694b8a
