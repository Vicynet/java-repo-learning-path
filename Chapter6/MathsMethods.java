import java.util.Scanner;
public class MathsMethods {
    private static double rounded;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //  double x;
        //  x = Math.floor(32.567 + 0.5);
        //  System.out.println(x);
        //  x = Math.floor(32.567 * 10 + 0.5)/10;
        //  System.out.println(x);
        //  x = Math.floor(32.567 * 100 + 0.5)/100;
        //  System.out.println(x);
        //  x = Math.floor(32.567 * 1000 + 0.5)/1000;
        //  System.out.println(x);
        //  System.out.println();
        // x = Math.floor(7.5);
        // System.out.println(x);
        // x = Math.abs(0.0);
        // System.out.println(x);
        // x = Math.ceil(0.0);
        // System.out.println(x);
        // x = Math.abs(-6.4);
        // System.out.println(x);
        // x = Math.ceil(-6.4);
        // System.out.println(x);
        // x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        // System.out.println(x);
        getRounds();
    }

    public static double toInt(double number) {
        rounded = Math.floor(number + 0.5);
        return rounded;
    }
    public static double toTens(double number) {
        rounded = Math.floor(number * 10 + 0.5)/10;
        return rounded;
    }
    public static double toHundreds(double number) {
        rounded = Math.floor(number * 100 + 0.5)/100;
        return rounded;
    }
    public static double toThousand(double number) {
        rounded = Math.floor(number * 1000 + 0.5)/1000;
        return rounded;
    }
    public static void getRounds() {
        System.out.print("Enter Number: ");
        double number = input.nextDouble();
        System.out.println(toInt(number));
        System.out.println(toTens(number));
        System.out.println(toHundreds(number));
        System.out.println(toThousand(number));
    }
}