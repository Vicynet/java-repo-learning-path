import java.util.Scanner;
public class MaxNumberExplicit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double number1 = input.nextDouble();
        System.out.print("\nEnter Second Number: ");
        double number2 = input.nextDouble();
        System.out.print("\nEnter Third Number: ");
        double number3 = input.nextDouble();

        double maxNumber = maximum(number1, number2, number3);

        System.out.println("Largest Number is: " + maxNumber);
        input.close();
    }

    public static double maximum(double a, double b, double c) {
        // double maxi = a;

        // if (b > maxi) {
        //     maxi = b;
        // }
        // if (c > maxi) {
        //     maxi = c;
        // }
        // return maxi;
        return Math.max(a, Math.max(b, c));
    }
}