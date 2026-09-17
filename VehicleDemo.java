import java.util.Scanner;

class Vehicle {

    public void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with push-button ignition.");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with self-start.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike): ");
        String type = sc.nextLine();

        Vehicle vehicle;

        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car();
            vehicle.start();
        } 
        else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
            vehicle.start();
        } 
        else {
            System.out.println("Invalid vehicle type.");
        }

        sc.close();
    }
}
