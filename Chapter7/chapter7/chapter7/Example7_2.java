package chapter7;
//Declaring and creating arrays
public class Example7_2 {
    public static void main(String[] args) {
        //declare variable array and create new array object
        int[] array = new int[10]; //create array object

        System.out.printf("%s%8s%n", "Index", "Value"); //column headings

        // output each array element's value by running through the array object
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        } //counter
    } //end main
} // class
