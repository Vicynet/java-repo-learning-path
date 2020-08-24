package chapter7; /**
 * Exercise7_8
 */
import java.util.Scanner;
import java.util.Arrays;

public class Exercise7_9 {

    public static void main(String[] args) {
        int[][] t = {{1,2,3},{4,5,6}};
    
        //number of rows
        System.out.println("Row Count is: " + t.length);
        //number of columns
        System.out.println("Column Count is: " + t[0].length);
        //Size of array t
        System.out.println("Size of array is: " + t.length * t[0].length);
        //Print first row elements
        System.out.print("First Row: ");
        for (int i = 0; i < t[0].length; i++) {
            System.out.print(t[0][i]);
        }
        System.out.println();
        //Print second row elements
        System.out.print("Second Row: ");
        for (int i = 0; i < t[1].length; i++) {
            System.out.print(t[1][i]);
        }
        System.out.println();
        //Print second elements
        System.out.print("Second Column: ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i][1]);
        }
        System.out.println();
        //Set element of Index of Row 0 and Column 1 to 0
        System.out.print("Set element of Index of Row 0 and Column 1 to 0: ");
        // for (int i = 0; i < t.length; i++) {
        //     for (int j = 0; j < t[i].length; j++) {
                t[0][0] = 0;
                t[0][1] = 0;
                // System.out.print(t[i][j]);
                System.out.print(Arrays.deepToString(t));
        //     }
        // }
        System.out.println();
        //Set elements of t to 0
        System.out.print("Set element of t to 0: ");
        t[0][0] = 0; t[0][1] = 0; t[0][2] = 0; t[1][0] = 0; t[1][1] = 0; t[1][2] = 0;
        System.out.println(Arrays.deepToString(t));

        System.out.println();
        //Set elements of t to 0 with For nested For
        System.out.print("Set element of t to 0 with nested For: ");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
               t[i][j] = 0;
            //    System.out.print(t[i][j]);
            }
        }
        System.out.print(Arrays.deepToString(t));

        System.out.println();
        //Set elements of t from User input
        System.out.print("Set element of t from User input: ");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("Enter Elements for array t: ");
                t[i][j] = input.nextInt();
               //t[i][j] = 0;
            //    System.out.print(t[i][j]);
            }
        }
        System.out.print(Arrays.deepToString(t));
        input.close();

        System.out.println();
        //Determine and display smallest value in t
        System.out.print("Display smallest value in t: ");
        int smallest = t[0][1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < smallest) {
                    smallest = t[i][j];
                }
            }
        }
        System.out.println(smallest);

        System.out.println();
        //Determine and display smallest value in t
        System.out.print("First Row with Printf: ");
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%d", t[0][i]);
        }

        System.out.println();
        //Sum Third Column in t
        int sum = 0;
        System.out.print("Sum Third Column: ");
        // for (int i = 0; i < t.length; i++) {
        //     for (int j = 0; j < t[i].length; j++) {
        //         sum += t[i][2];
        //     }
        // }
        sum = t[0][2] + t[1][2];
        System.out.println("Sum of Third Column: " + sum);

        System.out.println();
        //Values of t in tabular form
        System.out.print("t array in tabular form: ");
        System.out.println();
        System.out.printf("%12s","Column");
        System.out.println();
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%8d", i);
        }
        System.out.println();
        System.out.print("Row");
        for (int i = 0; i < t.length; i++) {
                System.out.printf("%4d", i);
        }

        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%3d",t[0][i]);
        }
        System.out.println();
        //Print second row elements
        for (int i = 0; i < t[1].length; i++) {
            System.out.printf("\t%3d",t[1][i]);

        }
        System.out.println();
    }
}