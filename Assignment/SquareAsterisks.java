/*(Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.*/
import java.util.Scanner;
public class SquareAsterisks {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in); 

    int size;
    System.out.print("Enter the integer number: ");
    size = input.nextInt();
        if (size <= 20) {
            int row = 1;
            while (row <= size) {
                System.out.print("*");
                row++;
            }
            System.out.print("\n");
            int coloum = 1;
            while (coloum <= size - 2) {
                row = 1;
                while (row <= size) {
                    if (row == 1 || row == size) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    row++;
                }
                System.out.print("\n");
                coloum++;
            }
            row = 1;
            while (row <= size) {
                System.out.print("*");
                row++;
            }
            System.out.print("\n");

        if (size > 20) {
                System.out.print("Try numbers 1 - 20 integer number: ");
                size = input.nextInt();
                
            }
        } 

 }
 } // end
 