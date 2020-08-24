package chapter14.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversedSentence {
    public static void main(String[] args) {

//        (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
//        text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
//        characters as delimiters.


        ArrayList<String[]> getWords = new ArrayList<>();
        Scanner words  = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String sentence = words.nextLine();
        String[] splitter = sentence.split(" ");
        String revWord2 = "";
        for (int i = splitter.length-1; i >= 0; i--) {
            String newWord = splitter[i];
            String revWord = "";
            for (int j = newWord.length()-1; j >= 0; j--) {
                revWord += newWord.charAt(j);
            }
            revWord2 += revWord + " ";
        }
        System.out.println(revWord2);

    }
}
