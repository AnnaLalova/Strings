package com.company;
import java.util.Arrays;
import java.util.Collections;

public class Assignment4 {
    enum suit {
        Hearts, Diamonds, Spades, Clubs
    }

    enum value {
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }

    static String[] Deck = cards();

    public static void main (String [] args) {

        System.out.println(Arrays.toString(Deck));
        shuffle();
    }

    public static String[] cards() {

        int c = 0;
        String[] TheDeck = new String[52];
        for (suit x : suit.values()) {
            for (value y : value.values()) {
                TheDeck[c] = x.toString() + y.toString();
                c++;
            }
        }
        return TheDeck;
    }

    public static void shuffle() {

        Collections.shuffle(Arrays.asList(Deck)); {
            System.out.println(Arrays.toString(Deck));
            System.out.println("First card: " + Arrays.toString(Arrays.copyOfRange(Deck, 0, 1)));
            System.out.println("The next six cards: " + Arrays.toString(Arrays.copyOfRange(Deck, 1, 7)));
        }
    }
}
