package chapter16;

import java.util.*;

public class ColorChooser {
    private enum color {BLACK, WHITE, BLUE , GREEN, YELLOW, PINK,
        RED, GREY, ORANGE, GOLD, BROWN, PURPLE, TEAL}

    public static void main(String[] args) {
// (Color Chooser) Use a HashMap to create a reusable class for choosing one of the 13 predefined
// colors in class Color. The names of the colors should be used as keys, and the predefined
//Color objects should be used as values. Place this class in a package that can be imported
// into any Java program. Use your new class in an application that allows the user
// to select a color and draw a shape in that color.

        // create HashMap to store String keys and Integer values
        Map<Enum, Integer> defaultColors = new HashMap<>();
        int count = 1;
        for (color systemColors : color.values()) {
            System.out.println(systemColors);

            // if the map contains the word
            if (defaultColors.containsKey(systemColors)) { // is word in map
//                int count = defaultColors.get(systemColors); // get current count
                defaultColors.put(systemColors, count++); // increment count
            }
            else {
                defaultColors.put(systemColors, count++); // add new word with a count of 1 to map
            }
        }

        Set<Enum> keys = defaultColors.keySet(); // get keys

        // sort keys
        TreeSet<Enum> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (Enum key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, defaultColors.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", defaultColors.size(), defaultColors.isEmpty());



    }
}
