package chapter16;

import java.util.*;

public class SortingWords {
//    (Sorting Words with a TreeSet) Write a program that uses a String method split to tokenize
//    a line of text input by the user and places each token in a TreeSet. Print the elements of the
//    TreeSet. [Note: This should cause the elements to be printed in ascending sorted order.]

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any sentence of your choice: ");
        String[] toSplit = input.nextLine().split(" ");
        System.out.println(Arrays.deepToString(toSplit));
        SortedSet<String> treeString = new TreeSet<>(Arrays.asList(toSplit));
        System.out.println(treeString);
    }
}
