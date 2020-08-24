package chapter16;

import java.util.*;

public class DuplicateElimination {
    private static Scanner firstName = new Scanner(System.in);
    public static void main(String[] args) {
//        (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
//        duplicates by storing them in a Set. Allow the user to search for a first name.

        List<String> firstNames = new ArrayList<>();

        System.out.print("Enter series of FirstNames and exit with ctrl+z when done: ");

        while (firstName.hasNext()) { //Get more first name entries until user finishes
            firstNames.add(firstName.nextLine()); //add entries into a list array
            System.out.println(firstNames); //print list for confirmation
            System.out.print("Enter series of FirstNames and exit with ctrl+z when done: ");
        }

        Set<String> getFirstNames = new HashSet<>(firstNames); //copy list array into name set to remove duplicates
        System.out.println("FirstNames in Set");
        System.out.println(getFirstNames); //print set for copy confirmation

        firstNames.clear(); //clear list array
        firstNames.addAll(getFirstNames); //copy name sets into list array
        System.out.println("Names copied: ");
        System.out.println(firstNames);
        System.out.println(firstNames.get(3));

        Scanner searchName = new Scanner(System.in);
        System.out.print("Enter a name to search for: ");
        String search = searchName.nextLine();

        searchFirstName(firstNames, search); //call method to search for firstName
    }

    private static void searchFirstName (List<String> nameList, String nameSearch) {

        System.out.printf("%nSearching for : %s%n", nameSearch);
        int searchResults = Collections.binarySearch(nameList, nameSearch);

        if (searchResults >= 0) {
            System.out.printf("FirstName Found at index %d%n", searchResults);
        }
        else {
            System.out.printf("%s not found %d%n", nameSearch, searchResults);
        }
    }
}
