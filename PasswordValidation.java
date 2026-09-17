import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase = true;
            }
            else if (Character.isLowerCase(ch)) {
                lowercase = true;
            }
            else if (Character.isDigit(ch)) {
                digit = true;
            }
            else {
                special = true;
            }
        }

        boolean valid = true;

        if (password.length() < 8) {
            System.out.println("Missing: At least 8 characters");
            valid = false;
        }

        if (!uppercase) {
            System.out.println("Missing: One uppercase letter");
            valid = false;
        }

        if (!lowercase) {
            System.out.println("Missing: One lowercase letter");
            valid = false;
        }

        if (!digit) {
            System.out.println("Missing: One digit");
            valid = false;
        }

        if (!special) {
            System.out.println("Missing: One special character");
            valid = false;
        }

        if (valid) {
            System.out.println("Password is Valid");
        }
        else {
            System.out.println("Password is Invalid");
        }

        sc.close();
    }
}
