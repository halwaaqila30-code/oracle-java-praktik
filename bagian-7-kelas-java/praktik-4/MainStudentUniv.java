import java.util.Date;

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstName, String middleName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}

class Student extends Person {
    private String nim;
    private double gpa;
    private String jurusan;
    private String gelar;
    private int tahunKelulusanDiharapkan;

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String nim, String jurusan, String gelar, int tahunKelulusanDiharapkan) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.jurusan = jurusan;
        this.gelar = gelar;
        this.tahunKelulusanDiharapkan = tahunKelulusanDiharapkan;
        this.gpa = 0.0;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getGpa() {
        return gpa;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Method untuk administrator mengubah jurusan mahasiswa
    public void ubahJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public int getTahunKelulusanDiharapkan() {
        return tahunKelulusanDiharapkan;
    }

    public void setTahunKelulusanDiharapkan(int tahunKelulusanDiharapkan) {
        this.tahunKelulusanDiharapkan = tahunKelulusanDiharapkan;
    }

    private double konversiNilai(String nilaiHuruf) {
        switch (nilaiHuruf.trim().toUpperCase()) {
            case "A": return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B": return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F":
            default: return 0.0;
        }
    }

    // Menghitung rata-rata IP dari array nilai huruf
    public double hitungIP(String[] daftarNilai) {
        if (daftarNilai == null || daftarNilai.length == 0) {
            this.gpa = 0.0;
            return this.gpa;
        }

        double totalPoin = 0.0;
        for (String nilai : daftarNilai) {
            totalPoin += konversiNilai(nilai);
        }

        this.gpa = totalPoin / daftarNilai.length;
        return this.gpa;
    }
}

public class MainStudentUniv {
    public static void main(String[] args) {
        Student mhs = new Student(
                "Halwa", "Aqila", "Putri", new Date(),
                "202611001", "Ilmu Komputer", "Sarjana", 2029
        );

        String[] nilaiSemester = {"A", "A-", "B+", "A"};
        mhs.hitungIP(nilaiSemester);

        System.out.println("Nama: " + mhs.getName());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Jurusan Awal: " + mhs.getJurusan());
        System.out.printf("IP: %.2f%n", mhs.getGpa());

        mhs.ubahJurusan("Matematika");
        System.out.println("Jurusan Setelah Diubah: " + mhs.getJurusan());
    }
}