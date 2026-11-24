public class LatihanString {
    public static void main(String[] args) {
        // 1. Tiga cara membuat String "myString" berisi "abc"
        String myString1 = "abc";
        String myString2 = new String("abc");
        String myString3 = new String(new char[]{'a', 'b', 'c'});

        System.out.println("=== Soal 1 ===");
        System.out.println("myString1 = " + myString1);
        System.out.println("myString2 = " + myString2);
        System.out.println("myString3 = " + myString3);

        // 2. Perbandingan s1, s2, dan s3
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("\n=== Soal 2 ===");
        System.out.println("a. s1.compareTo(s2) = " + s1.compareTo(s2));
        System.out.println("b. s2.equals(s3)    = " + s2.equals(s3));
        System.out.println("c. s3 == s1         = " + (s3 == s1));
        System.out.println("d. s2.compareTo(s3) = " + s2.compareTo(s3));
        System.out.println("e. s3.equals(s1)    = " + s3.equals(s1));

        // 3. Menggabungkan dua String ke String ketiga
        String bagianAwal = "Belajar Java ";
        String bagianAkhir = "di SMKN 4 Bogor";
        String hasilGabungan = bagianAwal + bagianAkhir;

        System.out.println("\n=== Soal 3 ===");
        System.out.println("Hasil gabungan = " + hasilGabungan);
    }
}