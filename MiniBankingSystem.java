import java.util.Scanner;

class Account {

    private String holderName;
    private String accountNumber;
    private double balance;

    public Account(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void displayAccount() {

        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public void balanceEnquiry() {

        System.out.println("Current Balance: ₹" + balance);
    }
}

public class MiniBankingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = null;

        int choice;

        do {

            System.out.println("\n----- Mini Banking System -----");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Balance Enquiry");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();

                    System.out.print("Enter opening balance: ");
                    double balance = sc.nextDouble();

                    if (balance < 0) {
                        System.out.println("Invalid balance.");
                    }
                    else {
                        account = new Account(name, accountNumber, balance);
                        System.out.println("Account created successfully.");
                    }

                    break;

                case 2:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                    }
                    else {
                        account.displayAccount();
                    }

                    break;

                case 3:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                    }
                    else {
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);
                    }

                    break;

                case 4:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                    }
                    else {
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);
                    }

                    break;

                case 5:

                    if (account == null) {
                        System.out.println("Please create an account first.");
                    }
                    else {
                        account.balanceEnquiry();
                    }

                    break;

                case 6:

                    System.out.println("Thank you for using Mini Banking System.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
