import java.util.Scanner;

public class SmallAndLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Enter Preferred Number: ");
         int number = input.nextInt();
        
         int largestNumber = 0;
         int numberCounter = 1;
         int smallestNumber = number;

         while (numberCounter < 10) {
            
            System.out.print("Enter Preferred Number: ");
            number = input.nextInt();

            numberCounter++;

            if (number < smallestNumber) {
                smallestNumber = number; 
            } 
            else if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.printf("Smallest number is: %d%nLargest Number is: %d%n", smallestNumber, largestNumber); 

        input.close();
    }
}