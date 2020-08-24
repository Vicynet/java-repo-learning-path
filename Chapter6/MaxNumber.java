
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        
        System.out.printf("Largest Number is: %d%n", Math.max(methodLargest(), 0)); 
    }

    public static int methodLargest () {
        Scanner input = new Scanner(System.in);

        int numberCounter = 1;
        int number = 0;
        while (numberCounter <= 4) {
            System.out.print("Enter Preferred Number: ");
            number = input.nextInt();
            numberCounter++;
        }
        input.close();
        return number;
    }
}        