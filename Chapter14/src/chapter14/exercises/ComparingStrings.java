package chapter14.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner compareString = new Scanner(System.in);
        ArrayList<String> wordComparison = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter one word at each prompt for comparison: ");
            wordComparison.add(compareString.nextLine());
        }

        int compareWords = wordComparison.get(0).compareTo(wordComparison.get(1));

        if(compareWords == 0) {
            System.out.println("The two strings you enter are equal");
        }
        else if(compareWords > 0) {
            System.out.println("The first word is greater than the second");
        }
        else {
            System.out.println("The second word is greater than the first");
        }
    }
}
