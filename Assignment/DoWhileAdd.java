import java.util.Scanner;
public class DoWhileAdd {
    public static void main(String[] args) {
        
        int prompt;
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("\nEnter First Number: ");
            number = input.nextInt();
            sum = sum + number;
        
            System.out.print("\nEnter Second Number: ");
            number = input.nextInt();
            sum = sum + number;

            System.out.println("\nSum of the two numbers you entered are: " + sum);
            sum = 0;

            System.out.print("\nType 1 to continue, -1 to quit: ");
            prompt = input.nextInt(); 
        } while (prompt != -1);
        input.close();
    }
} 