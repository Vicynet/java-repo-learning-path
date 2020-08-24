import java.util.Scanner;
public class BarChart
 {
 public static void main(String[] args)
 {
 int count;
 
 Scanner input = new Scanner(System.in);

for(count = 1; count <= 5; count++) {
    System.out.println("Enter a number");
    int number = input.nextInt();
    for(int asterix = 1; asterix<=number; asterix++){
        System.out.print("*");
    }
    System.out.println();
    input.close();
        
 }
 }
 } 