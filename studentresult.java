import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        System.out.print("Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;

        double percentage = total / 5.0;

        boolean fail = m1 < 40 || m2 < 40 || m3 < 40 || m4 < 40 || m5 < 40;

        String grade;

        if (percentage >= 80) {
            grade = "A";
        } 
        else if (percentage >= 60) {
            grade = "B";
        } 
        else if (percentage >= 50) {
            grade = "C";
        } 
        else if (percentage >= 40) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (fail) {
            System.out.println("Result: FAIL");
        } 
        else {
            System.out.println("Result: PASS");
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}