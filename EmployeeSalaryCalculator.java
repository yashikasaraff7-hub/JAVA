import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static double calculateHRA(double basic) {
        return basic * 0.20;
    }

    public static double calculateDA(double basic) {
        return basic * 0.10;
    }

    public static double calculateAllowance(double basic) {
        if (basic > 50000) {
            return basic * 0.05;
        }
        else {
            return basic * 0.02;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = calculateHRA(basic);
        double da = calculateDA(basic);
        double allowance = calculateAllowance(basic);

        double gross = basic + hra + da + allowance;

        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Allowance: ₹" + allowance);
        System.out.println("Gross Salary: ₹" + gross);

        sc.close();
    }
}
