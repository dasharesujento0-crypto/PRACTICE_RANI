import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       DENTAL CLINIC SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter contact number: ");
        String contactNumber = sc.nextLine();

        System.out.println("\n--- Appointment Details ---");

        System.out.print("Enter dentist: ");
        String dentist = sc.nextLine();

        System.out.println("1. Dental Check-up");
        System.out.println("2. Tooth Extraction");
        System.out.println("3. Cleaning");

        System.out.print("Choose appointment type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        String appointmentType;

        if (choice == 1) {
            appointmentType = "Dental Check-up";
        } else if (choice == 2) {
            appointmentType = "Tooth Extraction";
        } else {
            appointmentType = "Cleaning";
        }

        System.out.print("Enter appointment time: ");
        String appointmentTime = sc.nextLine();

        // Create Patient object
        Patient patient = new Patient(name, age, contactNumber);

        // Create Appointment object
        Appointment appointment =
                new Appointment(dentist, appointmentType, appointmentTime);

        System.out.println("\n=================================");
        System.out.println("       APPOINTMENT SUMMARY");
        System.out.println("=================================");

        patient.displayPatientInfo();

        System.out.println();

        appointment.displayAppointmentInfo();

        System.out.println("\nAppointment successfully recorded!");

        sc.close();
    }
}