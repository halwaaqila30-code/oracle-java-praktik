class Student {
    private String nama;
    private int kredit;
    private double poinMutu;
    private double ip;

    public Student(String nama, int kredit, double poinMutu) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinMutu = poinMutu;
        hitungIP();
    }

    private void hitungIP() {
        if (kredit > 0) {
            this.ip = poinMutu / kredit;
        } else {
            this.ip = 0.0;
        }
    }

    public double getIP() {
        hitungIP();
        return ip;
    }

    public void tambahMataKuliah(int kreditBaru, double poinMutuBaru) {
        this.kredit += kreditBaru;
        this.poinMutu += poinMutuBaru;
        hitungIP();
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %s | Kredit: %d | Poin Mutu: %.1f | IP: %.2f%n",
                nama, kredit, poinMutu, getIP());
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student mary = new Student("Mary Jones", 14, 46);
        Student john = new Student("John Stiner", 60, 173);
        Student ari = new Student("Ari Samala", 31, 69);

        System.out.println("=== Data Awal Mahasiswa ===");
        mary.tampilkanInfo();
        john.tampilkanInfo();
        ari.tampilkanInfo();

        // Soal 6: tambah 13 kredit dan 52 poin mutu ke Ari Samala
        ari.tambahMataKuliah(13, 52);

        System.out.println("\n=== Setelah Ari Samala Ditambah 13 Kredit & 52 Poin Mutu ===");
        ari.tampilkanInfo();
    }
}