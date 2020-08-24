package chapter14.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner phrase  = new Scanner(System.in);

        System.out.print("Enter a sentence with each word greater than one letter: ");

        String englishPhrase = phrase.nextLine();
        String[] splitter = englishPhrase.split(" ");

        printLatinWord(splitter);
    }

    public static void printLatinWord(String[] words) {

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].replace(words[i].charAt(0),' ').strip()
                    .concat(String.valueOf(words[i].charAt(0))).concat("ay"));
        }
    }
}
