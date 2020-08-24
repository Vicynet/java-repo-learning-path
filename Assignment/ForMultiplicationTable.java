import java.util.Scanner;
public class ForMultiplicationTable {
    public static void main(String[] args) {

        //int numberCounter;
        //int tabCounter = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Positive Integer: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table For Number" + "\t" + number);

        for(int tabCounter = 1;  tabCounter <=12;  tabCounter++){
            for(int numberCounter = 1; numberCounter <=12; numberCounter++)
        
            System.out.println("\n" + tabCounter++ + "\t\t" + numberCounter + "*" + number + "\t\t" + numberCounter*number);
         }
         input.close();
    }
}