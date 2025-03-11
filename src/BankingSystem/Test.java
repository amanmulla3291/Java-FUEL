package BankingSystem;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, 5000000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(1000);
    }
}
