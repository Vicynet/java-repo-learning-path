package chapter14.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparePortionsOfStrings {
    public static void main(String[] args) {
        Scanner compareStrings = new Scanner(System.in);
        ArrayList<String> wordComparison = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter one word at each prompt for comparison: ");
            wordComparison.add(compareStrings.nextLine());
        }

        boolean compareWords = wordComparison.get(0).regionMatches(
                true,0,wordComparison.get(1), 0, 3);

        if (compareWords) {
            System.out.println("The First three characters of the first and second words are the same");
        }
        else {
            System.out.println("The First three characters of the first and second words are not same");
        }




    }
}
