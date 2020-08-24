import java.util.Scanner;
public class BarChartReal {
    public static void main(String[] args) {
        Scanner bar = new Scanner(System.in);
        int number = 5;
        for (int counter = 1; counter <= 5; counter++) {
            if (number <= 30) {
                System.out.print("\nEnter Number To Print Bar Chart: ");
                number = bar.nextInt();
                
            }
            else {
                System.out.print("Enter Numbers From 1 - 30: ");
                break;
            }
            for (int count = 1; count <= number; count++) {
                if (number <= 30) {
                    if (counter <= 5) {
                    System.out.print('*');
                    }
                else {
                    
                break;
                    }
                }
            }
        }  
        bar.close();
    }
}