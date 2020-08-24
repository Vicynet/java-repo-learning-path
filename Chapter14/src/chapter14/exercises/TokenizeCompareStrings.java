package chapter14.exercises;

import java.util.Scanner;

public class TokenizeCompareStrings {
    public static void main(String[] args) {
//        (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes
//        the line using space characters as delimiters and outputs only those words beginning with the
//        letter "b".

        Scanner search = new Scanner(System.in);

        System.out.print("Enter s sentence: ");
        String sentence = search.nextLine();
        String[] tokens = sentence.split(" ");

        for (String token : tokens) {
            if (token.startsWith("b") || token.endsWith("ed")) {
                System.out.println(token);
            }
        }
    }
}
