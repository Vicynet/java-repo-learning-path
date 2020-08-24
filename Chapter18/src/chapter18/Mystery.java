package chapter18;

public class Mystery {
    public static int mystery(int a, int b) {
        if (b == 1) {
            return a;
        }
        else {
            return a + mystery(a, b - 1);
        }
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
