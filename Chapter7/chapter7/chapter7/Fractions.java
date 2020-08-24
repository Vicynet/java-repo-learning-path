package chapter7;//Exercise Fraction
/**
 * Fractions
 */
public class Fractions {
   public static void main(String[] args) {
    final int ARRAY_SIZE = 10;
    double[] ARRAY_SIZE2 = new double[ARRAY_SIZE];

       for (int i = 0; i < ARRAY_SIZE2.length; i++ ) {
           if (i == 4) {
                System.out.println("Output element of array located at index 4: " + ARRAY_SIZE2[4]);
           }
            ARRAY_SIZE2[9] = 1.667;
            ARRAY_SIZE2[6] = 3.333;
        }
        double sum = 0;
        for(double a : ARRAY_SIZE2) {
            System.out.println(a); //Output all elements of array
            sum = sum + a;
        }
        System.out.println("Sum of elements of Arrays " + sum);
   }
}