
public class MaxOverload {
    public static void main(String[] args) {
        
        System.out.printf("Largest Number is: %f%n", Math.max(methodLargest(5.6,4), 1)); 
    }

    public static int methodLargest (int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static double methodLargest (double x, int y) {
         if (x > y)
             return x;
         else
             return y;
     }
       
}        