public class AsteriskTest {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 4) {
            System.out.println("*");
            counter++;
            if (counter == 2) {
                System.out.println("**");
                counter++;
            }
            if (counter == 3) {
                System.out.println("***");
                counter++;
            }
            if (counter == 4) {
                System.out.println("****");
                counter++;
            }
        }
    }
}