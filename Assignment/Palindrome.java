import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Any Five Digit Number or -1 To Terminate Session: ");
        int number = input.nextInt();

        while (number != -1) {
            while((number%100000) != number) {
                System.out.println("You entered a number above five digits");
                System.out.print("Enter Any Five Digit Number or -1 To Terminate Session: ");
                number = input.nextInt();
            }
            while((number%10000) == number) {
                System.out.println("You entered a number below five digits");
                System.out.print("Enter Any Five Digit Number or -1 To Terminate Session: ");
                number = input.nextInt();
            }
            int one = number/10000;
            int two = (number%10000)/1000;
            int three = (number%1000)/100;
            int four = (number%100)/10;
            int five = (number%10)/1;

            int firstTest = one + two + three;
            int secondTest = three + four + five;

            if(firstTest == secondTest) {
                System.out.println("You have a Palindrome!");
                System.out.print("Enter Any Five Digit Number or -1 To Terminate Session: ");
                number = input.nextInt();
            }
            else {
                System.out.println("You do not have a Palindrome, Try again!");
                System.out.print("Enter Any Five Digit Number or -1 To Terminate Session: ");
                number = input.nextInt();
            }
            
        }
    
    }
}