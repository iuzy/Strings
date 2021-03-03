import java.util.*;

public class String4 {

    enum Suit {
        SPADES, CLUBS, HEARTS, DIAMONDS
    }

    enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    static String[] cardPack = new String[52];

    public static void createCardPack() {

        int i = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cardPack[i] = r + " " + s;
                i++;
            }
        }
        System.out.println(Arrays.toString(cardPack));
    }

    public static void workWithCardPack() {

        ArrayList <String> newCardPack = new ArrayList<>(Arrays.asList(cardPack));
        Collections.shuffle(newCardPack);
        newCardPack.toArray(new String[0]);

        System.out.println("\nShuffled card pack:");
        System.out.println(newCardPack);
        System.out.println();

        System.out.println("First card: " + newCardPack.get(0));
        System.out.println();

        newCardPack.remove(0);
        System.out.println("Card pack after removing first card: \n" + newCardPack);

        System.out.println("\nCards to be removed:");
        int i = 0;
        while (i < 6) {
            System.out.println(newCardPack.get(0));
            newCardPack.remove(0);
            i++;
        }
        System.out.println("\nCard pack after removing 6 more cards: \n" + newCardPack);
    }


    public static void main(String[] args) {

        System.out.println("\nInitial card pack:");
        createCardPack();
        workWithCardPack();

    }
}