import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder pesan = new StringBuilder();
        int jumlahValid = 0;

        System.out.println("Masukkan 10 angka kode rahasia (1-7) satu per satu:");

        while (jumlahValid < 10) {
            System.out.print("Angka ke-" + (jumlahValid + 1) + ": ");
            int kode = in.nextInt();
            String huruf = "";
            boolean dikenali = true;

            switch (kode) {
                case 1:
                    huruf = "D";
                    break;
                case 2:
                    huruf = "W";
                    break;
                case 3:
                    huruf = "E";
                    break;
                case 4:
                    huruf = "L";
                    break;
                case 5:
                    huruf = "H";
                    break;
                case 6:
                    huruf = "O";
                    break;
                case 7:
                    huruf = "R";
                    break;
                default:
                    dikenali = false;
                    System.out.println("Angka " + kode + " belum terpecahkan. Silakan masukkan angka baru.");
            }

            if (dikenali) {
                pesan.append(huruf);
                jumlahValid++;
            }
        }

        System.out.println("\nPesan yang teruraikan: " + pesan.toString());
        in.close();
    }
}