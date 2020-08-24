package chapter17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any sentence of your choice: ");
        String[] toSplit = input.nextLine().split(" ");
        System.out.println(Arrays.deepToString(toSplit));
        SortedSet<String> treeString = new TreeSet<>(Arrays.asList(toSplit));
        System.out.println(treeString);
    }
}
