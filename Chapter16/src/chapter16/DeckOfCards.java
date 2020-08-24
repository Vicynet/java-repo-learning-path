package chapter16;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// DeckOfCards class represents a deck of playing cards.
class Card {

    public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    public static enum Suit { Hearts, Diamonds, Clubs, Spades};

    private final Face face; // array of Card objects
    private final Suit suit; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    // constructor fills deck of Cards
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // return face of the card
    public Face getFace() {
        return face;
    }

    // return suit of Card
    public Suit getSuit() {
        return suit;
    }

    // return String representation of Card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}

// class DeckOfCards declaration
public class DeckOfCards {
    private List<Card> list; // declare List that will store Cards

    // set up deck of Cards and shuffle
    public DeckOfCards() {

        Card[] deck = new Card[52];
        int count = 0; // number of cards

        // populate deck with Card objects
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck); // get List
        Collections.shuffle(list); // shuffle deck
    }

    // output deck
    public void printCards() {
        // display 52 cards in two columns
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
} // end class DeckOfCards
