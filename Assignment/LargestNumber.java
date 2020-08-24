import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNumber = 0;
        int numberCounter = 1;

        while (numberCounter <= 10) {
            System.out.print("Enter Preferred Number: ");
            int number = input.nextInt();
            numberCounter++;

            if (number > largestNumber) {
                largestNumber = number; 
            } 
        }
        System.out.printf("Largest Number is: %d%n", largestNumber); 

        input.close();
    }
}