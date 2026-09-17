import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } 
        else {
            System.out.println("Withdrawal rejected: Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter holder name: ");
        String holderName = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        BankAccount account =
            new BankAccount(accountNumber, holderName, balance);

        account.deposit(deposit);
        account.withdraw(withdraw);

        System.out.println("\n----- Account Details -----");
        account.display();

        sc.close();
    }
}
