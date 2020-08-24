import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      int reversal = 0;

      System.out.println("Enter an integer to reverse");
      int number = input.nextInt();
      while(number != 0) {
        reversal = reversal * 10;
        reversal = reversal + number%10;
        number = number/10;
      }
    System.out.println("Reverse of the number is " + reversal);
    input.close();
  }
}


















  // System.out.println("\nEnter number: ");
        // int number = input.nextInt();
        // // StringBuffer input1 = new StringBuffer(number);

        // // input1 = input1.reverse();

        // // System.out.println(input1);
        // int[] reversal = number.tointArray();
        // for (int counter = reversal.length-1; i >= 0; i--) {
        //     System.out.print(reversal[i]);