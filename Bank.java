//<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;
public class Bank {
    private static Bank instance;
    
    private String bankId;
    private String bankName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank(String bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    public Bank(){
        
    }
     public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank("CTS001", "CTS Bank");
        }
        return instance;
    }
    public void createAccount(BankAccount account) {
        accounts.add(account);
    }

    public void deleteAccount(BankAccount account) {
        accounts.remove(account);
    }

    public ArrayList<BankAccount> getAllAccounts() {
        return accounts;
    }
    private ArrayList<Customer> customers = new ArrayList<>();
     public void registerCustomer(String username, String password) {
        customers.add(new Customer(username, password));
    }

    public void openAccount(Customer customer,
                            String accountNumber,
                            double initialDeposit,
                            String accountType) {

        BankAccount account;

        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountNumber, initialDeposit);
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountNumber, initialDeposit);
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }

        customer.setAccount(account);
        //customers.add(newCustomer);
    }
   
    /**
    public void registerCustomer( String username, String password, String accountNumber, double deposit, String accountType) {
     //BankAccount account = new BankAccount(accountNumber, deposit);   
     BankAccount account;

        // Polymorphism
        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountNumber, initialDeposit);
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountNumber, initialDeposit);
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }
    Customer newCustomer = new Customer(username, password, account);
    customers.add(newCustomer);
}
**/
public Customer validateLogin(String username, String password) {
    for (Customer c : customers) {
        if (c.getUsername().equals(username) && c.getPassword().equals(password)) {
            return c;
        }
    }
    return null;
}
public Customer findCustomerByUsername(String username) {
    for (Customer c : customers) {
        if (c.getUsername().equals(username)) {
            return c;
        }
    }
    return null;
}

}

