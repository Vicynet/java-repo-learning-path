import java.util.Scanner;
public class DoWhileAddBreak {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("\nEnter First Number: ");
            int number1 = input.nextInt();
        
            System.out.print("\nEnter Second Number: ");
            int number2 = input.nextInt();

            int sum = number1 + number2;

            System.out.println("\nSum of the two numbers you entered are: " + sum);

            System.out.print("\nType 1 to continue, 2 to quit: ");
            int prompt = input.nextInt();
            if (prompt == 2) {
                break;
            }
            else {
               ;
            }   
        } while (true);
        input.close();
    }
} 