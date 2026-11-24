import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan 5 nilai tes (masing-masing maksimal 100 poin):");
        for (int i = 0; i < nilaiTes.length; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = in.nextDouble();
            total += nilaiTes[i];
        }

        double rataRata = total / nilaiTes.length;
        System.out.println("\nRata-rata nilai mahasiswa: " + rataRata);

        in.close();
    }
}