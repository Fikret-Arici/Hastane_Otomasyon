public class Patient extends Person {
    // Alanlar
    private String id;
    private String diagnosis;
    private Prescription[] prescriptions;

    // Kurucu
    public Patient(String name, int age, String[] hobbies, String id, String diagnosis, Prescription[] prescriptions) {
        super(name, age, hobbies); // Üst sınıfın kurucusunu çağırır
        this.id = id;
        this.diagnosis = diagnosis;
        this.prescriptions = prescriptions;
    }

    // Yöntemler
    public String getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Prescription[] getPrescriptions() {
        return prescriptions;
    }
}
