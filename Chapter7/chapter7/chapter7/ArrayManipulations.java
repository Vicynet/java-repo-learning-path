package chapter7;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        // sort doubleArray into ascending order
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };

        Arrays.sort(doubleArray);
        displayArray(doubleArray, "DoubleArray");


        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];

        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "FilledArray");

        // copy array intArray into array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };

        displayArray(intArray, "OriginalArray");

        int[] intArrayCopy = new int[intArray.length];

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArrayCopy, "CopiedArray");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        boolean c = Arrays.equals(intArray, filledIntArray);
        System.out.printf("%nintArray %s intArrayCopy%n", (c ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);
         if (location >= 0) {
             System.out.printf("Found 5 at element %d in intArray%n", location);
         }
         else {
             System.out.println("5 not found in intArray");
         }
       // search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        }
        else {
            System.out.println("8763 not found in intArray");
        }
    }

    // output values in each array
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (int value : array)
            System.out.printf("%d ", value);
    }
    public static void displayArray(double[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (double value : array)
            System.out.printf("%.1f ", value);
    }

}
