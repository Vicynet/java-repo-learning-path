package chapter7;

public class EnhancedForArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int sumArray: array) {
            total += sumArray;
        }
        System.out.printf("Total of array elements: %d%n", total);
    }
}
