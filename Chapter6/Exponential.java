import java.util.Scanner;
public class Exponential {
    private static Scanner exponent = new Scanner(System.in);
    private static int baseNumber, exponentNumber, result = 1;
    public static void main(String[] args) {
        getBaseExp();
    }
    public static void collect() {
        System.out.print("Enter Base Number: ");
        baseNumber = exponent.nextInt();
        System.out.print("\nEnter Exponent Number: ");
        exponentNumber = exponent.nextInt();
    }
    public static int integerPower(int baseN, int exponentN) {
        for(int i = 0; i < exponentN; i++) {
            result *= baseN; 
        }
        return result;
    }
    public static void getBaseExp() {
        collect();
        System.out.println(integerPower(baseNumber, exponentNumber));
    }
}