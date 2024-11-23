public class Person {
    // Alanlar
    private String name;
    private int age;
    private String[] hobbies;

    // Kurucu
    public Person(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    // Yöntemler
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }
}
