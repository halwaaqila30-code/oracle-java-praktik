import java.util.Random;
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

class Deck {
    Card[] cardArray = new Card[52];
    private int nextCardIndex = 0;

    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        nextCardIndex = 0;
    }

    public Card dealCard() {
        if (nextCardIndex >= cardArray.length) {
            shuffle();
        }
        return cardArray[nextCardIndex++];
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}

class Hand {
    Card[] cards = new Card[5];
    int count = 0;

    public void addCard(Card c) {
        if (count < cards.length && c != null) {
            cards[count++] = c;
        }
    }

    public int getTotalPoints() {
        int total = 0;
        int aceAsElevenCount = 0;

        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceAsElevenCount++;
            }
        }

        while (total > 21 && aceAsElevenCount > 0) {
            total -= 10;
            aceAsElevenCount--;
        }

        return total;
    }

    public void printHand(String owner) {
        System.out.println("Kartu " + owner + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("  - " + cards[i]);
        }
        System.out.println("Total poin " + owner + ": " + getTotalPoints());
    }
}

public class PermainanKartu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deck d = new Deck();
        d.shuffle();

        System.out.println("=== Verifikasi Deck Setelah Diacak (5 kartu teratas) ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + d.cardArray[i]);
        }

        Hand player = new Hand();
        Hand dealer = new Hand();

        player.addCard(d.dealCard());
        player.addCard(d.dealCard());
        dealer.addCard(d.dealCard());
        dealer.addCard(d.dealCard());

        System.out.println("\n=== Giliran Pemain ===");
        player.printHand("Pemain");

        while (player.count < 5 && player.getTotalPoints() <= 21) {
            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawab = in.next().trim().toLowerCase();
            if (jawab.equals("y")) {
                player.addCard(d.dealCard());
                player.printHand("Pemain");
            } else {
                break;
            }
        }

        int playerPoints = player.getTotalPoints();
        if (playerPoints > 21) {
            System.out.println("\nPoin Anda melebihi 21 (Bust). Dealer menang!");
            in.close();
            return;
        }

        System.out.println("\n=== Giliran Dealer ===");
        dealer.printHand("Dealer");
        while (dealer.getTotalPoints() < 16 && dealer.count < 5) {
            System.out.println("Dealer mengambil kartu...");
            dealer.addCard(d.dealCard());
            dealer.printHand("Dealer");
        }

        int dealerPoints = dealer.getTotalPoints();
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Poin Pemain: " + playerPoints + " | Poin Dealer: " + dealerPoints);

        if (dealerPoints > 21 || playerPoints > dealerPoints) {
            System.out.println("Selamat! Anda mengalahkan Dealer!");
        } else if (playerPoints == dealerPoints) {
            System.out.println("Seri (Push)!");
        } else {
            System.out.println("Dealer menang.");
        }

        in.close();
    }
}