import java.util.Scanner;
public class SwitchOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Value: ");
        int value = input.nextInt();

        switch (value % 2) {
        case 0:
        System.out.println("Even integer");
        break;
        case 1:
        System.out.println("Odd integer");
        break;
        }
        input.close();
    }
} 

