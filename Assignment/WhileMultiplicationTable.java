import java.util.Scanner;
public class WhileMultiplicationTable {
    public static void main(String[] args) {

        int numberCounter = 1;
        int tabCounter = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Positive Integer: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table For Number" + "\t" + number);

        while (numberCounter <= 12 && tabCounter <=12){
        
            System.out.println("\n" + tabCounter++ + "\t\t" + numberCounter + "*" + number + "\t\t" + numberCounter*number);

            numberCounter++;
        }
        input.close();
    }
}