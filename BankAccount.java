package oopAssignment;

public class BankAccount {
    private String accountId;
    private double balance;
    private static int id = 1;

    public BankAccount() {
        accountId = generateAccountId();
        balance = 0.0;
    }

    public BankAccount(double balance) {
        accountId = generateAccountId();
        this.balance = balance > 0 ? balance : 0;
    }

    private String generateAccountId() {
        return "Account" + id++;
    }

    public String getAccountId() {
        return accountId;
    }

    private void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance > 0 ? balance : 0;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {//adds money if negative
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
        if (amount - balance < 0) {
            System.out.println("insufficient balance!");
            return false;
        }
        balance -= amount;
        System.out.println("Balance =" + balance);
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return false;
        }
        balance += amount;
        System.out.println("Balance =" + balance);
        return true;
    }
    public static int getNextAccountID(){
        return id;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        System.out.println(account1.getAccountId());

        BankAccount account2 = new BankAccount();
        System.out.println(account2.getAccountId());

        BankAccount account3 = new BankAccount();
        System.out.println(account3.getAccountId());

        System.out.println(BankAccount.getNextAccountID());

    }

}
