import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner in = new Scanner(System.in);

        // Deklarasi variabel
        double gallons = 0;
        double liters = 0;

        // Meminta input jumlah galon dari pengguna
        System.out.print("Masukkan jumlah galon: ");
        gallons = in.nextDouble();

        // Rumus konversi: 1 galon AS = 3,785 liter
        liters = gallons * 3.785;

        // Menampilkan hasil konversi
        System.out.println(gallons + " gallons equals " + liters + " liters");

        in.close();
    }
}