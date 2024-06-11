package oopAssignment;

public class Main {
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
