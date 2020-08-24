package chapter7;

public class Example7_4 {
    public static void main(String[] args) {

        //declare and initialize constant variable array_length
        final int array_length = 10;

        //create and declare an array object with variable array_length
        int[] array = new int[array_length];

        //calculate value for each array element
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        //column headings
        System.out.printf("%s%8s%n", "Index", "Value");

        // output each array element's value by running through the array object
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        } //counter
    } //end main
}
