package chapter14.exercises;

import java.security.SecureRandom;

public class Limericks {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        String[] threeVerseRhymes = {"beard", "feared", "beer", "died", "read", "red"};
        String[] twoVerseRhymes = {"road", "bold", "told", "old", "toad", "need", "lead", "seed"};

        SecureRandom randomRhymes = new SecureRandom();
        StringBuilder firstLine = new StringBuilder();
        StringBuilder secondLine = new StringBuilder();
        StringBuilder thirdLine = new StringBuilder();
        StringBuilder fourthLine = new StringBuilder();
        StringBuilder fifthLine = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            firstLine.append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(verb[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(preposition[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(threeVerseRhymes[randomRhymes.nextInt(5)]);
            secondLine.append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(verb[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(preposition[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(threeVerseRhymes[randomRhymes.nextInt(5)]);
            thirdLine.append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(verb[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(preposition[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(twoVerseRhymes[randomRhymes.nextInt(5)]);
            fourthLine.append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(verb[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(twoVerseRhymes[randomRhymes.nextInt(5)]);
            fifthLine.append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(verb[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(preposition[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(article[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(noun[randomRhymes.nextInt(5)])
                    .append(" ")
                    .append(threeVerseRhymes[randomRhymes.nextInt(5)]);
            System.out.println(firstLine.toString());
            System.out.println(secondLine.toString());
            System.out.println(thirdLine.toString());
            System.out.println(fourthLine.toString());
            System.out.println(fifthLine.toString());
            firstLine.delete(0, firstLine.length()+1);
            secondLine.delete(0, secondLine.length()+1);
            thirdLine.delete(0, thirdLine.length()+1);
            fourthLine.delete(0, fourthLine.length()+1);
            fifthLine.delete(0, fifthLine.length()+1);
            System.out.println();
        }
    }
}
