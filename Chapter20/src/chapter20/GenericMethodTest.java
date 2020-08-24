package chapter20;

public class GenericMethodTest {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
    }

    // generic method printArray to print any type array
//    public static <Vin> void printArray(Vin[] inputArray) {
//        // display array elements
//        for (Vin element : inputArray) {
//            System.out.printf("%s ", element);
//        }
//        System.out.println();
//    }
    // generic method printArray(using Object parameter section to print any type array
    public static void printArray(Object[] inputArray) {
        // display array elements
        for (Object element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
