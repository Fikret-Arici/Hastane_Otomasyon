public class Staff extends Person {
    // Alanlar
    private String id;
    private String position;
    private double salary;

    // Kurucu
    public Staff(String name, int age, String[] hobbies, String id, String position, double salary) {
        super(name, age, hobbies); // Üst sınıfın kurucusunu çağırır
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    // Yöntemler
    public String getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
