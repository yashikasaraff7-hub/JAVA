import java.util.Scanner;

class Order {

    private String customer;
    private String item;
    private int quantity;
    private double price;

    public Order(String customer, String item, int quantity, double price) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateSubtotal() {
        return quantity * price;
    }

    public double calculateDiscount() {
        double subtotal = calculateSubtotal();

        if (subtotal > 1000) {
            return subtotal * 0.05;
        }
        else {
            return 0;
        }
    }

    public double calculateFinalAmount() {
        double subtotal = calculateSubtotal();
        double discount = calculateDiscount();
        double delivery = 50;

        return subtotal - discount + delivery;
    }

    public void displayBill() {

        double subtotal = calculateSubtotal();
        double discount = calculateDiscount();
        double delivery = 50;
        double finalAmount = calculateFinalAmount();

        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Delivery: ₹" + delivery);
        System.out.println("Final: ₹" + finalAmount);
    }
}

public class OnlineFoodOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customer = sc.nextLine();

        System.out.print("Enter item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Order order = new Order(customer, item, quantity, price);

        order.displayBill();

        sc.close();
    }
}
