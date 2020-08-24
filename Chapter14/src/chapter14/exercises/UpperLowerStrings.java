package chapter14.exercises;

import java.util.Scanner;

public class UpperLowerStrings {
    public static void main(String[] args) {
//        (Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of
//        text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.

        Scanner  text = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = text.nextLine();

        for (int i = 0; i < 2; i++) {
            System.out.println(sentence.toUpperCase());
            if (i == 1) {
                System.out.println(sentence.toLowerCase());
            }
        }
    }
}
