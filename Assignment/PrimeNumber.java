import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a positive number of your choice: ");
        int prime = input.nextInt();
        
            if (prime >= 4 && (prime%2 == 0 || prime%3 == 0)) {
                System.out.println(prime + " is not a prime number");
            } 
            else if (prime > 5 && prime%5 == 0) {
                System.out.println(prime + " is not a prime number");
            }
            else if (prime > 7 && prime%7 == 0) {
                System.out.println(prime + " is not a prime number");
            }
            else {
                System.out.println(prime + " is a prime number");
            }
        input.close();
    }
}