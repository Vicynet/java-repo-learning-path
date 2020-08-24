import java.util.Scanner;
public class Just {
    public static void main(String[] args) {
        Scanner bar = new Scanner(System.in);
        //int counter = 1;
        // int number = 0;
        // System.out.print("Enter Number To Print Bar Chart: ");
        int number = 5;
        for (int counter = 1; counter <= 5; counter++) {
            if (number <= 30) {
                System.out.print("\nEnter Number To Print Bar Chart: ");
                number = bar.nextInt();
            }
            else {
                System.out.print("Enter Numbers From 1 - 30: \n");
                break;
            }
            
            for (int count = 1; count <= number; count++) {
               if (number > 30) {
                System.out.print("Enter Numbers From 1 - 30: \n");
                number = bar.nextInt();
                    }
                else {
                    ;
                    //if (counter <= 5) {;
                        
                //}
                }
                System.out.print("*");

            }
        // for (int count = 1; count <= number; count++) {
        //     System.out.print("*");
        // }

            // for (int chart = 1; chart <= 5; chart++) {
            //     int number = 1;
            //     if (number <= 30) {
            //         System.out.print("Enter Number To Print Bar Chart: ");
            //         number = bar.nextInt();
            //     }
            //     for (int i = number; i <= number;) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            
        }  
    }
}