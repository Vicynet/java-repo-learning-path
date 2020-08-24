package chapter16;

import java.util.*;

public class CountingLetters {
    public static void main(String[] args) {
//   (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
// of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs,
//  three Es, two Ls, one O, one T and one R. Display the results.

// create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

//        createMap(myMap); // create map based on user input
//        displayMap(myMap); // display map content

        int[] a;
        a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 2;
        }

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        System.out.printf("Result is: %d%n", result);

    }

    // create map from user input
    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split("");
//        StringTokenizer tokens2 = new StringTokenizer(input);

        System.out.print(Arrays.toString(tokens));

        // processing input text
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word

            // if the map contains the word
            if (map.containsKey(word)) { // is word in map
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            }
            else {
                map.put(word, 1); // add new word with a count of 1 to map
            }
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
