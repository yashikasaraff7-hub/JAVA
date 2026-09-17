import java.util.Scanner;

abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            shape = new Circle(radius);

        } 
        else if (choice == 2) {

            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            shape = new Rectangle(length, width);

        } 
        else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.printf("Area: %.2f sq.units%n", shape.calculateArea());

        sc.close();
    }
}
