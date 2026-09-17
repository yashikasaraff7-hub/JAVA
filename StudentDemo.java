import java.util.Scanner;

class Student {

    private int rollNo;
    private String name;
    private String course;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } 
        else {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Roll No: ");
        student.setRollNo(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter Course: ");
        student.setCourse(sc.nextLine());

        System.out.print("Enter Marks: ");
        student.setMarks(sc.nextInt());

        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No " + student.getRollNo());
        System.out.println("Name " + student.getName());
        System.out.println("Course " + student.getCourse());
        System.out.println("Marks " + student.getMarks());

        sc.close();
    }
}

