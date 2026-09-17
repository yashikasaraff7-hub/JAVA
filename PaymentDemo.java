import java.util.Scanner;

interface Payment {

    void pay(double amount);
}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("₹" + amount + " paid successfully using UPI.");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("₹" + amount + " paid successfully using Credit Card.");
    }
}

class CashOnDelivery implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("₹" + amount + " will be paid using Cash on Delivery.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment type (UPI/CreditCard/CashOnDelivery): ");
        String type = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (type.equalsIgnoreCase("UPI")) {

            payment = new UPI();

        } 
        else if (type.equalsIgnoreCase("CreditCard")) {

            payment = new CreditCard();

        } 
        else if (type.equalsIgnoreCase("CashOnDelivery")) {

            payment = new CashOnDelivery();

        } 
        else {

            System.out.println("Invalid payment type.");
            sc.close();
            return;
        }

        payment.pay(amount);

        sc.close();
    }
}
