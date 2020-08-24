package chapter7;

// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.
public class DeckOfCardsTest {
    // execute application
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        // print all 52 Cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++) {
            // deal and display a Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i % 4 == 0) {
                System.out.println(); // output a newline after every fourth card
            } 
        }
    }
} // end class DeckOfCardsTest