
public class SavingsAccount extends BankAccount {

    private double minimumBalance;
    private int withdrawalLimit;

    public SavingsAccount(String accountNumber, double balance,
                          double interestRate, double minimumBalance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
        this.withdrawalLimit = 5;
    }
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    public boolean checkMinimumBalance() {
        return getBalance() >= minimumBalance;
    }

    public boolean validateWithdrawal(double amount) {
        return (getBalance() - amount) >= minimumBalance;
    }
    @Override
public boolean withdraw(double amount) {
    if (amount <= 0 || amount > getBalance()) { // Simple validation 
        return false; // Withdrawal failed
    }
    // Perform the actual withdrawal (deduct amount from balance)
    this.minimumBalance -= amount;
    return true; // Withdrawal successful
}

}

