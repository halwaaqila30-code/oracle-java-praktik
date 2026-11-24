import java.util.Scanner;

class Card {
    String suit;
    String name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    private String getSuit(int n1) {
        switch (n1) {
            case 1: return "Spades";
            case 2: return "Hearts";
            case 3: return "Diamonds";
            case 4: return "Clubs";
            default: return "Unknown";
        }
    }

    private String getName(int n2) {
        switch (n2) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Unknown";
        }
    }

    private int getPoints(String cardName) {
        switch (cardName) {
            case "Ace": return 11;
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(cardName);
        }
    }

    @Override
    public String toString() {
        return "The " + name + " of " + suit;
    }
}

public class MainCard {
    private static Card ambilKartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] hand = new Card[5];
        int jumlahKartu = 0;

        // Soal 7: dua kartu acak pertama
        hand[jumlahKartu++] = ambilKartuAcak();
        hand[jumlahKartu++] = ambilKartuAcak();

        System.out.println("=== Kartu Awal di Hand ===");
        for (int i = 0; i < jumlahKartu; i++) {
            System.out.println("  - " + hand[i] + " (" + hand[i].points + " poin)");
        }

        int totalPoin = hand[0].points + hand[1].points;
        System.out.println("Total poin awal: " + totalPoin);

        // Soal 8b & 8c: loop hingga maksimal 5 kartu, poin > 21, atau pengguna berhenti
        while (jumlahKartu < 5 && totalPoin <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawab = in.next().trim().toLowerCase();
            if (!jawab.equals("y")) {
                break;
            }

            Card kartuBaru = ambilKartuAcak();
            hand[jumlahKartu++] = kartuBaru;
            totalPoin += kartuBaru.points;

            System.out.println("\nKartu di Hand sekarang (" + jumlahKartu + " kartu):");
            for (int i = 0; i < jumlahKartu; i++) {
                System.out.println("  - " + hand[i] + " (" + hand[i].points + " poin)");
            }
            System.out.println("Total poin saat ini: " + totalPoin);
        }

        System.out.println("\nPermainan selesai. Total kartu: " + jumlahKartu + " | Total poin akhir: " + totalPoin);
        in.close();
    }
}