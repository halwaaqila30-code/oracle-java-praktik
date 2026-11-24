import java.util.Scanner;

public class ContohPenangananError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Contoh penanganan exception (misalnya pembagian dengan nol / input tidak sesuai)
        try {
            System.out.print("Masukkan angka pembilang (integer): ");
            int pembilang = in.nextInt();

            System.out.print("Masukkan angka penyebut (integer): ");
            int penyebut = in.nextInt();

            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input/eksekusi: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        /*
         * Contoh segmen kode Soal 4 (dikomentari agar file bisa dikompilasi):
         *
         * a. Syntax error:
         * int angka = 10   // kurang titik koma (;)
         *
         * b. Logic error (kode jalan tanpa error, tapi logika rata-rata salah karena kurang tanda kurung):
         * int a = 80, b = 90;
         * double rataSalah = a + b / 2; // menghasilkan 125.0 alih-alih 85.0
         *
         * c. Exception (runtime error, misal akses index di luar batas array):
         * int[] data = {1, 2, 3};
         * System.out.println(data[5]); // melempar ArrayIndexOutOfBoundsException
         */

        in.close();
    }
}