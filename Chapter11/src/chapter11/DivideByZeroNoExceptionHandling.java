package chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator) throws ArithmeticException, InputMismatchException {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed

        do
        {
            try // read two numbers and calculate quotient
            {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false; // input successful; end looping
            }
            catch (InputMismatchException | ArithmeticException wrongInputException)
            {
                System.err.printf("%nException: %s%n", wrongInputException);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf("Wrong input. Please try again.%n%n");
            }
//            catch (ArithmeticException arithmeticException)
//            {
//                System.err.printf("%nException: %s%n", arithmeticException);
//                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
//            }
        } while (continueLoop);
    }
}
