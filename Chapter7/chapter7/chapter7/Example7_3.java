package chapter7;
//initializing an array
public class Example7_3 {
    public static void main(String[] args) {
        //declare variable array and initialize array elements with values
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; //create array object

        System.out.printf("%s%8s%n", "Index", "Value"); //column headings

        // output each array element's value by running through the array object
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        } //counter
    } //end main
}
