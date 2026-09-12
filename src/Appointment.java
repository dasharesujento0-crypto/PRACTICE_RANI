public class Appointment {

    String dentist;
    String appointmentType;
    String appointmentTime;

    public Appointment(String dentist, String appointmentType, String appointmentTime) {
        this.dentist = dentist;
        this.appointmentType = appointmentType;
        this.appointmentTime = appointmentTime;
    }

    public void displayAppointmentInfo() {
        System.out.println("Dentist: " + dentist);
        System.out.println("Appointment Type: " + appointmentType);
        System.out.println("Appointment Time: " + appointmentTime);
    }
}