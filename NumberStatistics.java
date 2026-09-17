import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        int sum = 0;
        int largest = 0;
        int smallest = 0;
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            sum = sum + num;

            if (i == 1) {
                largest = num;
                smallest = num;
            }

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }

            if (num % 2 == 0) {
                even++;
            } 
            else {
                odd++;
            }
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}

