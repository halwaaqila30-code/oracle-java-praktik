import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        String op = in.next();

        if (op.equals("+")) {
            System.out.println("Hasil = " + (angka1 + angka2));
        } else if (op.equals("-")) {
            System.out.println("Hasil = " + (angka1 - angka2));
        } else if (op.equals("*")) {
            System.out.println("Hasil = " + (angka1 * angka2));
        } else if (op.equals("/")) {
            if (angka2 != 0) {
                System.out.println("Hasil = " + (angka1 / angka2));
            } else {
                System.out.println("Error: tidak bisa membagi dengan nol.");
            }
        } else if (op.equals("%")) {
            if (angka2 != 0) {
                System.out.println("Hasil = " + (angka1 % angka2));
            } else {
                System.out.println("Error: modulus dengan nol tidak valid.");
            }
        } else {
            System.out.println("Operator tidak dikenali.");
        }

        in.close();
    }
}