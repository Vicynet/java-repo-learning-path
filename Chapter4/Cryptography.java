import java.util.Scanner;
public class Cryptography {
    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);

            System.out.print("Enter Four Digit Password: ");
            int initialPassword = leo.nextInt();

            if(initialPassword <= 999 || initialPassword > 9999){
                System.out.print("Please Enter Four Digit Password");
            }


            else {

                int Q1 = initialPassword / 1000;
                int Q2 = (initialPassword % 1000) / 100;
                int Q3 = (initialPassword % 100) / 10;
                int Q4 = (initialPassword % 10) / 1;

                int encrypt1 = (Q1 + 7) % 10;
                int encrypt2 = (Q2 + 7) % 10;
                int encrypt3 = (Q3 + 7) % 10;
                int encrypt4 = (Q4 + 7) % 10;

                int encrypt0 = encrypt1;
                encrypt1 = encrypt3;
                encrypt3 = encrypt0;
                int encrypt00 = encrypt2;
                encrypt2 = encrypt4;
                encrypt4 = encrypt00;

                System.out.printf("Your encrypted password is %d%d%d%d%n", encrypt1, encrypt2, encrypt3, encrypt4);
            }






    }
}
