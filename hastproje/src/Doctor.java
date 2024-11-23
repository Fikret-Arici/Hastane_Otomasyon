public class Doctor extends Staff {
    // Alanlar
    private String specialization;
    private Appointment[] appointments;

    // Kurucu
    public Doctor(String name, int age, String[] hobbies, String id, String position, double salary, String specialization, Appointment[] appointments) {
        super(name, age, hobbies, id, position, salary); // Üst sınıfın kurucusunu çağırır
        this.specialization = specialization;
        this.appointments = appointments;
    }

    // Yöntemler
    public String getSpecialization() {
        return specialization;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }
}
