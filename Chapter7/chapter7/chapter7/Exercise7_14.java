package chapter7;

public class Exercise7_14 {
    public static void main(String[] args) {
        System.out.println(variableLength(2, 2));
        System.out.println(variableLength(2, 2, 2));
    }

    public static int variableLength (int... entry) {
        int product = 1;
        for (int productEntry : entry) {
            product *= productEntry;
        }
        return product;
    }
}
