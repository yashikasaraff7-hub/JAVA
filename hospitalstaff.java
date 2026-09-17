import java.util.Scanner;

class Staff {

    protected String name;
    protected String id;

    public Staff(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

class Doctor extends Staff {

    private String specialization;

    public Doctor(String name, String id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Role Doctor; Specialization " + specialization);
    }
}

class Nurse extends Staff {

    private String ward;

    public Nurse(String name, String id, String ward) {
        super(name, id);
        this.ward = ward;
    }

    @Override
    public void displayRole() {
        System.out.println("Role Nurse; Ward " + ward);
    }
}

public class HospitalStaff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter staff type (Doctor/Nurse): ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        Staff staff;

        if (type.equalsIgnoreCase("Doctor")) {

            System.out.print("Enter specialization: ");
            String specialization = sc.nextLine();

            staff = new Doctor(name, id, specialization);
            staff.displayRole();

        }
        else if (type.equalsIgnoreCase("Nurse")) {

            System.out.print("Enter ward: ");
            String ward = sc.nextLine();

            staff = new Nurse(name, id, ward);
            staff.displayRole();

        }
        else {
            System.out.println("Invalid staff type.");
        }

        sc.close();
    }
}
