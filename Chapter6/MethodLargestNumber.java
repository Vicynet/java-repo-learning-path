
import java.util.Scanner;

public class MethodLargestNumber {
    public static void main(String[] args) {

        System.out.printf("Largest Number is: %d%n", methodLargest()); 
    }

    public static int methodLargest () {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int numberCounter = 1;
        while (numberCounter <= 4) {
            System.out.print("Enter Preferred Number: ");
            int number = input.nextInt();
            numberCounter++;

            if (number > largestNumber) {
                largestNumber = number; 
            } 
        }
        input.close();
        return largestNumber;
    }
    
}
        