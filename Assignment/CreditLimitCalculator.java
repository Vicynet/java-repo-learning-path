import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      
      int customerCounter = 0;
      int newAccountBalance = 0;
      int creditApplied = 0;
      int creditLimit = 0;
      
      System.out.print("Enter Account Number For Customer or -1 to quit: ");
      int accountNumber = input.nextInt();
     
      while (accountNumber != -1) {

        System.out.print("Enter Initial Account Balance For Customer or -1 to quit: ");
        int accountBalance = input.nextInt();
        
        System.out.print("Enter Total Amount For Items Purchased By Customer or -1 to quit: ");
        int totalItemsAmount = input.nextInt();

        System.out.print("Enter Total Credit Applied For By Customer or -1 to quit: ");
        creditApplied = input.nextInt();

        System.out.print("Enter Allowed Credit Limit or -1 to quit: ");
        creditLimit = input.nextInt();

        newAccountBalance = accountBalance + totalItemsAmount - creditApplied;

        customerCounter++;
        
        if (customerCounter != 0 && newAccountBalance > creditLimit) {
          System.out.print("Credit Limit Exceeded\n\n");
        }
        else if (customerCounter != 0 && newAccountBalance < creditLimit) {
          System.out.printf("New Account Balance For Customer %d is: %d%n", customerCounter, newAccountBalance);
        }
        else {
          System.out.print("No Customer Record Entered");
        }
        System.out.print("Enter Account Number For Customer or -1 to quit: ");
        accountNumber = input.nextInt();
    }
      input.close();
    }
}