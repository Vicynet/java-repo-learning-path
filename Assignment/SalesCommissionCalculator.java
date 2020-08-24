import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      double itemOnePrice = 239.99;
      double itemTwoPrice = 129.75;
      double itemThreePrice = 99.95;
      double itemFourPrice = 350.89;
      double weeklyPay = 200.00;
      double salesCommission = 0;
      double totalItemSold = 0;
      int salesCounter = 0;

      System.out.print("Enter 1 for Item 1, 2 for Item 2, 3 for Item 3, 4 for Item 4 or 0 to quit: ");
      int buyItem = input.nextInt();
     
      while (buyItem != 0) {

        if (buyItem == 1) {
            totalItemSold += itemOnePrice;
        } else if (buyItem == 2) {
            totalItemSold += itemTwoPrice;
        } else if (buyItem == 3) {
            totalItemSold += itemThreePrice;
        } else {
            totalItemSold += itemFourPrice;
        }
        salesCommission = weeklyPay + (totalItemSold/100*9); 
        salesCounter++;

        System.out.print("Enter 1 for Item 1, 2 for Item 2, 3 for Item 3, 4 for Item 4 or 0 to quit: ");
        buyItem = input.nextInt();

        }
        
        System.out.printf("Sales For This Current Sales Person is: %.2f", salesCommission);
      
        input.close();
    
    }
}