import java.util.Scanner;
public class First20Even {
    public static void main(String[] args) {
        int counter = 1;
        int totalCounter = 0;
        //int lCounter = 0;
        //int totalCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int number = input.nextInt();

        while (counter < 20) {
            System.out.print("Enter A Number: ");
        number = input.nextInt();
        counter++;
            if (number%2 == 0) {
                
                totalCounter = totalCounter + number; 
                

            }

            //++counter;
        }
        System.out.println("Sum of Even Numbers are: " + totalCounter);

        /*while (counter <= 10) {
            totalCounter = totalCounter + counter;
            //System.out.println(totalCounter);
            counter++;
            if (totalCounter%6 == 0) {
                totalCounter = totalCounter - counter;
                //System.out.println(totalCounter);
                counter++;  
            }
        }
        System.out.println(totalCounter);
        */
           
           
       
    }
}