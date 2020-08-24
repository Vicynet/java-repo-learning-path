import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // System.out.print("\nEnter a positive number of your choice: ");
        // int prime = input.nextInt();

            // if (prime > 3 && prime != 2 || prime != 3) {
            //     if (prime%2 && prime%3 == 0) {
            //         System.out.println(prime + " is not a prime number");
            //     } 
            //     if (prime%11 == 0) {
            //         System.out.println(prime + " is not a prime number");
            //     }
            //     else {
            //         System.out.println(prime + " is a prime number");
            //     input.close();
            //     }
            // }
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter any number:");
            //capture the input in an integer
            int num=scan.nextInt();
                scan.close();
                int i=2;
                while(i<= num/2)
                {
                   if(num % i == 0)
                   {
                    isPrime = false;
                    break;
                   }
                   i++;
                }
            //If isPrime is true then the number is prime else not
            if(isPrime)
               System.out.println(num + " is a Prime Number");
            else
               System.out.println(num + " is not a Prime Number");
           

    }
}