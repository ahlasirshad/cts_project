
public class CurrentAccount extends BankAccount {

    private double overdraftLimit;
    private double transactionFee;

    public CurrentAccount(String accountNumber, double balance,
                          double overdraftLimit, double transactionFee) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
        this.transactionFee = transactionFee;
    }
    public CurrentAccount(String accountNumber, double balance){
       super(accountNumber, balance); 
    }
    @Override
    public boolean withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount - transactionFee);
        }
        return true;
    }

    @Override
    public void calculateInterest() {
        // Current accounts usually have no interest
        System.out.println("No interest for Current Account");
    }

    public double getOverdraftBalance() {
        return overdraftLimit + getBalance();
    }
    
}
