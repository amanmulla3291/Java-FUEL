package BankingSystem;

public class BankAccount {
    private double balance;
    private final int accountNumber;

    public BankAccount(int accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance must be greater than 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit (double depositAmount) {
    if (depositAmount > 0) {
        balance += depositAmount;
        System.out.println("Successfully deposited " + depositAmount + ". New balance is " + balance);
    } else {
        System.out.println("Invalid deposit amount. Please enter an amount greater than 0.");
    }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
                System.out.println("Successfully withdraw " + withdrawAmount + ". Remaining balance is " + balance);
            } else {
                System.out.println("Insufficient balance. Withdrawal Amount exceeds current balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter an amount greater than 0.");
        }
    }
}
