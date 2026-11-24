import java.util.Scanner;

public class KalkulatorMatriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Pilih ukuran matriks (2 untuk 2x2, 3 untuk 3x3): ");
        int ukuran = in.nextInt();
        if (ukuran != 2 && ukuran != 3) {
            ukuran = 2;
        }

        int[][] matriksA = new int[ukuran][ukuran];
        int[][] matriksB = new int[ukuran][ukuran];
        boolean sudahInputA = false;
        boolean sudahInputB = false;

        String pilihan;
        do {
            System.out.println("\n=== Menu Kalkulator Matriks (" + ukuran + "x" + ukuran + ") ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih opsi (a-f): ");
            pilihan = in.next().toLowerCase();

            switch (pilihan) {
                case "a":
                    matriksA = inputMatriks(in, ukuran, "A");
                    sudahInputA = true;
                    break;
                case "b":
                    matriksB = inputMatriks(in, ukuran, "B");
                    sudahInputB = true;
                    break;
                case "c":
                    if (cekSiap(sudahInputA, sudahInputB)) {
                        tampilkanMatriks(tambahMatriks(matriksA, matriksB));
                    }
                    break;
                case "d":
                    if (cekSiap(sudahInputA, sudahInputB)) {
                        tampilkanMatriks(kurangMatriks(matriksA, matriksB));
                    }
                    break;
                case "e":
                    if (cekSiap(sudahInputA, sudahInputB)) {
                        tampilkanMatriks(kaliMatriks(matriksA, matriksB));
                    }
                    break;
                case "f":
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih a sampai f.");
            }
        } while (!pilihan.equals("f"));

        in.close();
    }

    private static int[][] inputMatriks(Scanner in, int ukuran, String nama) {
        int[][] m = new int[ukuran][ukuran];
        System.out.println("Masukkan elemen Matriks " + nama + ":");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print(nama + "[" + i + "][" + j + "] = ");
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    private static boolean cekSiap(boolean adaA, boolean adaB) {
        if (!adaA || !adaB) {
            System.out.println("Harap masukkan Matriks A dan Matriks B terlebih dahulu.");
            return false;
        }
        return true;
    }

    private static int[][] tambahMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    private static int[][] kurangMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    private static int[][] kaliMatriks(int[][] a, int[][] b) {
        int n = a.length;
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                hasil[i][j] = sum;
            }
        }
        return hasil;
    }

    private static void tampilkanMatriks(int[][] m) {
        System.out.println("Hasil:");
        for (int[] baris : m) {
            System.out.print("[ ");
            for (int j = 0; j < baris.length; j++) {
                System.out.print(baris[j]);
                if (j < baris.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
    }
}