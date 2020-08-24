package chapter7;
//Computing the sum of the element in an array
public class SumArray {
    public static void main(String[] args) {
        //initialize the array
        int array[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};
        //declare and initialize variable total to hold sum of array elements
        int total = 0;
        //run through the array and sum all the value of each element
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }
        //print sum
        System.out.println(total);
    }
}