public class Main {

        public static void main(String[] args) {
            // Hastane sınıfından bir nesne oluştur
            Hospital hospital = new Hospital("Ankara Hastanesi", "Ankara", null);

            // Person sınıfından iki nesne oluştur
            Person person1 = new Person("Ali", 25, new String[]{"futbol", "sinema"});
            Person person2 = new Person("Ayşe", 30, new String[]{"müzik", "kitap"});

            // Patient sınıfından bir nesne oluştur
            Patient patient = new Patient("Mehmet", 40, new String[]{"yürüyüş", "yemek"}, "123", "grip", null);

            // Staff sınıfından iki nesne oluştur
            Staff staff1 = new Staff("Can", 35, new String[]{"bilgisayar", "oyun"}, "456", "hemşire", 3000.0);
            Staff staff2 = new Staff("Deniz", 45, new String[]{"resim", "yoga"}, "789", "doktor", 5000.0);

            // Department sınıfından bir nesne oluştur
            Department department = new Department("Acil Servis", "Acil durumlara müdahale eder", new Staff[]{staff1, staff2});

            // Doctor sınıfından bir nesne oluştur
            Doctor doctor = new Doctor("Ece", 50, new String[]{"seyahat", "bahçe"}, "101", "başhekim", 7000.0, "kardiyoloji", null);

            // Nurse sınıfından bir nesne oluştur
            Nurse nurse = new Nurse("Fatma", 55, new String[]{"dikiş", "yüzme"}, "202", "yardımcı hemşire", 2500.0, "gece", "Can");

            // Appointment sınıfından bir nesne oluştur
            Appointment appointment = new Appointment(patient, doctor, "21.12.2023", "13:00");

            // Prescription sınıfından bir nesne oluştur
            Prescription prescription = new Prescription("303", "aspirin", "günde 2", "1 hafta");

            // Nesnelerin alanlarını ve yöntemlerini kullan
            System.out.println("Hastane adı: " + hospital.getName());
            System.out.println("Hastane adresi: " + hospital.getAddress());
            System.out.println("Hastane bölümleri: " + hospital.getDepartments());

            System.out.println("Kişi 1 adı: " + person1.getName());
            System.out.println("Kişi 1 yaşı: " + person1.getAge());
            System.out.println("Kişi 1 hobileri: " + person1.getHobbies());

            System.out.println("Kişi 2 adı: " + person2.getName());
            System.out.println("Kişi 2 yaşı: " + person2.getAge());
            System.out.println("Kişi 2 hobileri: " + person2.getHobbies());

            System.out.println("Hasta adı: " + patient.getName());
            System.out.println("Hasta id: " + patient.getId());
            System.out.println("Hasta tanısı: " + patient.getDiagnosis());
            System.out.println("Hasta reçeteleri: " + patient.getPrescriptions());

            System.out.println("Personel 1 adı: " + staff1.getName());
            System.out.println("Personel 1 id: " + staff1.getId());
            System.out.println("Personel 1 pozisyonu: " + staff1.getPosition());
            System.out.println("Personel 1 maaşı: " + staff1.getSalary());

            System.out.println("Personel 2 adı: " + staff2.getName());
            System.out.println("Personel 2 id: " + staff2.getId());
            System.out.println("Personel 2 pozisyonu: " + staff2.getPosition());
            System.out.println("Personel 2 maaşı: " + staff2.getSalary());

            System.out.println("Bölüm adı: " + department.getName());
            System.out.println("Bölüm açıklaması: " + department.getDescription());
            System.out.println("Bölüm personeli: " + department.getStaff());

            System.out.println("Doktor adı: " + doctor.getName());
            System.out.println("Doktor id: " + doctor.getId());
            System.out.println("Doktor pozisyonu: " + doctor.getPosition());
            System.out.println("Doktor maaşı: " + doctor.getSalary());
            System.out.println("Doktor uzmanlığı: " + doctor.getSpecialization());
            System.out.println("Doktor randevuları: " + doctor.getAppointments());

            System.out.println("Hemşire adı: " + nurse.getName());
            System.out.println("Hemşire id: " + nurse.getId());
            System.out.println("Hemşire pozisyonu: " + nurse.getPosition());
            System.out.println("Hemşire maaşı: " + nurse.getSalary());
            System.out.println("Hemşire vardiyası: " + nurse.getShift());
            System.out.println("Hemşire amiri: " + nurse.getSupervisor());

            System.out.println("Randevu hastası: " + appointment.getPatient());
            System.out.println("Randevu doktoru: " + appointment.getDoctor());
            System.out.println("Randevu tarihi: " + appointment.getDate());
            System.out.println("Randevu saati: " + appointment.getTime());

            System.out.println("Reçete id: " + prescription.getId());
            System.out.println("Reçete ilacı: " + prescription.getMedicine());
            System.out.println("Reçete dozu: " + prescription.getDosage());
            System.out.println("Reçete süresi: " + prescription.getDuration());
        }
    }


