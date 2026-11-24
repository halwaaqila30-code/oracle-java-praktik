import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    private static String bersihkanTeks(String teks) {
        return teks.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String s1 = in.nextLine();

        System.out.print("Masukkan string kedua: ");
        String s2 = in.nextLine();

        char[] arr1 = bersihkanTeks(s1).toCharArray();
        char[] arr2 = bersihkanTeks(s2).toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Hasil: \"" + s1 + "\" MERUPAKAN anagram dari \"" + s2 + "\".");
        } else {
            System.out.println("Hasil: \"" + s1 + "\" BUKAN anagram dari \"" + s2 + "\".");
        }

        in.close();
    }
}