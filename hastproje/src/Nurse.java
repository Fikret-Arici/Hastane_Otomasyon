public class Nurse extends Staff {
    // Alanlar
    private String shift;
    private String supervisor;

    // Kurucu
    public Nurse(String name, int age, String[] hobbies, String id, String position, double salary, String shift, String supervisor) {
        super(name, age, hobbies, id, position, salary); // Üst sınıfın kurucusunu çağırır
        this.shift = shift;
        this.supervisor = supervisor;
    }

    // Yöntemler
    public String getShift() {
        return shift;
    }

    public String getSupervisor() {
        return supervisor;
    }
}
