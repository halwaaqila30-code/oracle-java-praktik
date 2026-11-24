import java.util.Scanner;

public class CatRuangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan: ");
        double tinggi = in.nextDouble();

        System.out.print("Masukkan panjang ruangan: ");
        double panjang = in.nextDouble();

        System.out.print("Masukkan lebar ruangan: ");
        double lebar = in.nextDouble();

        double luasLangitLangit = panjang * lebar;
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double totalLuas = luasLangitLangit + luasDinding;

        double cakupanEmber5L = 1500.0;
        double cakupanEmber1L = 300.0;
        int harga5L = 15;
        int harga1L = 4;

        int maxEmber5L = (int) Math.ceil(totalLuas / cakupanEmber5L);
        int terbaik5L = maxEmber5L;
        int terbaik1L = 0;
        int biayaMinimum = terbaik5L * harga5L;

        for (int e5 = 0; e5 <= maxEmber5L; e5++) {
            double sisaLuas = totalLuas - (e5 * cakupanEmber5L);
            int e1 = (sisaLuas > 0) ? (int) Math.ceil(sisaLuas / cakupanEmber1L) : 0;
            int totalBiaya = (e5 * harga5L) + (e1 * harga1L);

            if (totalBiaya < biayaMinimum) {
                biayaMinimum = totalBiaya;
                terbaik5L = e5;
                terbaik1L = e1;
            }
        }

        int totalEmber = terbaik5L + terbaik1L;

        System.out.println("Total luas yang dicat: " + totalLuas);
        System.out.println("Total ember yang dibutuhkan: " + totalEmber);
        System.out.println("Kombinasi optimal: " + terbaik5L + " ember (5L) dan " + terbaik1L + " ember (1L)");
        System.out.println("Perkiraan biaya minimum: $" + biayaMinimum);

        in.close();
    }
}