import java.util.Scanner;

public class SeleksiMountville {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah valedictorian atau salutatorian? (true/false): ");
        boolean topRank = in.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah: ");
        int jumlahSiswa = in.nextInt();

        System.out.print("Masukkan GPA: ");
        double gpa = in.nextDouble();

        System.out.print("Masukkan skor SAT: ");
        int sat = in.nextInt();

        boolean diterima =
            (topRank && jumlahSiswa >= 1400) ||
            (gpa >= 4.0 && sat >= 1100) ||
            (gpa >= 3.5 && sat >= 1300) ||
            (gpa >= 3.0 && sat >= 1500);

        if (diterima) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi kriteria penerimaan Mountville University.");
        }

        in.close();
    }
}