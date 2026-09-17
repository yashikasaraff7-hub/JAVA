import java.util.Scanner;

class Book {

    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void issue() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        Book book = new Book(id, title, author);

        System.out.print("Enter Action (Issue/Return): ");
        String action = sc.nextLine();

        if (action.equalsIgnoreCase("Issue")) {
            book.issue();
        }
        else if (action.equalsIgnoreCase("Return")) {
            book.returnBook();
        }
        else {
            System.out.println("Invalid action.");
        }

        sc.close();
    }
}
