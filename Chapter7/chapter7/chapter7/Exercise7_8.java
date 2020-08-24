package chapter7; /**
 * Exercise7_8
 */
import java.util.Arrays;

public class Exercise7_8 {

    public static void main(String[] args) {
        int[] f = new int[7];
        int[] w = {20,2,3,21,23,34,45,56,67,1,16};
        int[] g = {8,8,8,8,8};
        int[] g1 = new int[5];
        int[] a = {2, 3, 3, 4};
        int[] b = new int[34];

        float[] c = new float[100];
        float total = 0;

        for (int i = 0; i < f.length; i++) {
            if (i == 6) {
                System.out.println(f[i]);
            }
        }
        for (int i : g1) {
            i = 8;
            System.out.print(i);
        }
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
//
        b = Arrays.copyOf(a, 34);
        for (int i : b) {
            System.out.print(i);
        }
        System.out.println();
//
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//
//        int largest = 0;
//        int smallest = w[0];
//        for(int i = 0;i < w.length;i++){
//            if(w[i] > largest) {
//                largest = w[i];
//            }
//            if (w[i] < smallest) {
//                smallest = w[i];
//            }
//        }
//        System.out.println(largest);
//        System.out.println(smallest);


    }
}