/*(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = 0;
        int secondLargestNumber = 0;
        int numberCounter = 1;

        while (numberCounter <= 10) {
            System.out.print("Enter Preferred Number: ");
           int number = input.nextInt();
            numberCounter++;

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            }
            else if (number > secondLargestNumber) {     
                secondLargestNumber = number;
            }     
        }
        System.out.printf("Largest Number is: %d%n", largestNumber); 
       
        System.out.printf("Second Largest Number is: %d%n", secondLargestNumber); 

        input.close();
    }
}