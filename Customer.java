<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;
public class Customer {

     private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String password;
    private BankAccount account;
    private String securityQuestion;
    private String securityAnswer;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
       
    }
   // private BankAccount account;
     public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
    return account;

    }
    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getSecurityQuestion() {
        return securityQuestion; 
    }
    public String getSecurityAnswer() { 
        return securityAnswer; 
    }

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
   
    // No-argument constructor
    public Customer() {
    }

    
    // Parameterized constructor (optional)
    public Customer(String customerId, String firstName, String lastName,
                    String email, String phone, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters & Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPassword(String password) {
    this.password = password;
    }

    // Business method
    public void register() {
        // Later you can connect this to database (JDBC)
        System.out.println("Customer registered successfully: " 
                           + firstName + " " + lastName);
    }
    public void login() {
        System.out.println("Customer Logged In");
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
import java.util.ArrayList;
public class Customer {

     private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String password;
    private BankAccount account;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
       
    }
   // private BankAccount account;
     public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
    return account;

    }
    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
   
    // No-argument constructor
    public Customer() {
    }

    
    // Parameterized constructor (optional)
    public Customer(String customerId, String firstName, String lastName,
                    String email, String phone, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters & Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Business method
    public void register() {
        // Later you can connect this to database (JDBC)
        System.out.println("Customer registered successfully: " 
                           + firstName + " " + lastName);
    }
    public void login() {
        System.out.println("Customer Logged In");
    }
}

>>>>>>> c0e59ef2047b8890d2bbd5253a5b09108b694b8a
