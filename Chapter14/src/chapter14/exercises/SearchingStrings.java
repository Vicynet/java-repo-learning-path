package chapter14.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingStrings {
    public static void main(String[] args) {
//        (Searching Strings) Write an application that inputs a line of text and a search character and
//        uses String method indexOf to determine the number of occurrences of the character in the text.

        Scanner search = new Scanner(System.in);

        System.out.print("Enter sentence with repeated special character: ");
        String sentence = search.nextLine();
//        Pattern findCharacter = Pattern.compile("[$]");
//        Matcher match = findCharacter.matcher(sentence);
        int countFinder = 0;
//
//        while (match.find()) {
//            countFinder++;
//            System.out.printf("Showed up:  %d times", sentence.indexOf("$"));
//        }
//        System.out.println(countFinder);

//        int position = 0;
//        while (position >= 0) {
//            position = sentence.indexOf("$", position + 1);
//            countFinder++;
//        }
//        System.out.println(countFinder);
        for (int i = 0; (i = sentence.indexOf("$", i)) >= 0 ; i++) {
            countFinder++;
        }
        System.out.println(countFinder);

    }
}
