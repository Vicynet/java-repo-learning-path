package chapter7;

public class SmallAndLarge {
    public static void main(String[] args) {
        double[] w = {2.2, 1.1, 3.4, 4.5, 1.0, 2.0};
        double smallest = w[0];
        double largest = w[0];

        for (int i = 0; i < w.length; i++) {
            if (w[i] < smallest) {
                smallest = w[i];
            }
            else {
                if (w[i] > largest) {
                    largest = w[i];
                }
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
