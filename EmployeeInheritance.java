import java.util.Scanner;

class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void calculateCompensation() {
        double bonus = salary * 0.20;
        double total = salary + bonus;

        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Compensation: ₹" + total);
    }
}

class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void calculateCompensation() {
        double bonus = salary * 0.10;
        double total = salary + bonus;

        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Compensation: ₹" + total);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (Manager/Developer): ");
        String type = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (type.equalsIgnoreCase("Manager")) {

            Manager manager = new Manager(name, salary);

            manager.display();
            manager.calculateCompensation();

        } 
        else if (type.equalsIgnoreCase("Developer")) {

            Developer developer = new Developer(name, salary);

            developer.display();
            developer.calculateCompensation();

        } 
        else {
            System.out.println("Invalid employee type.");
        }

        sc.close();
    }
}
