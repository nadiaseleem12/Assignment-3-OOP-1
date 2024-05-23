package oopAssignment;

public class BankAccount {
    private String accountId;
    private double balance;
    BankAccount(){
        accountId = "";
        balance = 0.0;
    }
    BankAccount(double balance){
        accountId = "";
        this.balance = balance;
    }


    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        if (amount-balance<0)
            return;
        balance -= amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }
}
