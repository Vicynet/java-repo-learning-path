import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);

        System.out.println("Enter four digits to decrypt: ");
        int decryptPassword = leo.nextInt();

        int Q3 = decryptPassword / 1000;
        int Q4 = (decryptPassword % 1000) / 100;
        int Q1 = (decryptPassword % 100) / 10;
        int Q2 = (decryptPassword% 10) / 1;

        int decrypt1 = (Q1 + 3)%10;
        int decrypt2 = (Q2 + 3)%10;
        int decrypt3 = (Q3 + 3)%10;
        int decrypt4 = (Q4 + 3)%10;

        System.out.printf("The encrypted value is %d%d%d%d%n",decrypt1,decrypt2,decrypt3,decrypt4);
    }
}
