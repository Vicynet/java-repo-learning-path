package chapter7;

public class InitArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1 = {23, 24};
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%d%8d%n", counter, array[counter]);
        }
        for (int counter = 0; counter < array1.length; counter++) {
            System.out.printf("%d%8d%n", counter, array1[counter]);
        }
        System.out.println(array[8]);
    }
}