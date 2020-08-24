package chapter14.exercises;

import java.security.SecureRandom;

public class RandomSentences {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        SecureRandom pickWord = new SecureRandom();

        for (int wordPicker = 1; wordPicker <= 20; wordPicker++) {
            System.out.printf("(%d) %s%n", wordPicker, article[pickWord.nextInt(5)] + " " + noun[pickWord.nextInt(5)] + " " +
                    verb[pickWord.nextInt(5)] + " " + preposition[pickWord.nextInt(5)]);
        }
    }
}
