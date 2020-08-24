package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class TwoByThreeT {
    public static void main(String[] args) {
//        int[][] t = new int[2][3];
        int[][] t = {{1, 2, 3}, {4, 5, 6}};

        //rows
        System.out.println(t.length);
        //columns
        System.out.println(t[0].length);
        //elements
        System.out.println(t.length * t[0].length);
        //access expressions for elements in row 1
        for (int rows = 0; rows < t[0].length; rows++) {
            System.out.print(t[0][rows]);
        }
        System.out.println();
        //access expressions for element in column 2
        for (int rows = 0; rows < t.length; rows++) {
            System.out.print(t[rows][1]);
        }
        System.out.println();
        //set element of t in row 1 column 0 to 0
        t[0][1] = 0;
        System.out.print(Arrays.deepToString(t));
        System.out.println();
        //set all element of t to 0 individually
        t[0][0] = 0; t[0][1] = 0; t[0][2] = 0; t[1][0] = 0; t[1][1] = 0; t[1][2] = 0;
        System.out.print(Arrays.deepToString(t));
        System.out.println();
        //nested for to initialize each element of t to 0
        for (int rows = 0; rows < t.length; rows++) {
            for (int columns = 0; columns < t[rows].length; columns++) {
                t[rows][columns] = 0;
            }
        }
        System.out.print(Arrays.deepToString(t));
        System.out.println();
        //get elements from user and determine smallest value
        Scanner input = new Scanner(System.in);
        int smallest = t[0][0];
        for (int rows = 0; rows < t.length; rows++) {
            for (int columns = 0; columns < t[rows].length; columns++) {
                System.out.print("Enter element: ");
//                int elements = input.nextInt();
                t[rows][columns] = input.nextInt();

                if (t[rows][columns] < smallest) {
                    smallest = t[rows][columns];
                }
                System.out.println();
            }
        }
        System.out.print(Arrays.deepToString(t));
        System.out.println(smallest);
        //printf for element in row 1
        for (int rows = 0; rows < t[0].length; rows++) {
            System.out.printf("%d", t[0][rows]);
        }
        System.out.println();
        //total elements of column 2
        int total = 0;
        for (int rows = 0; rows < t.length; rows++) {
            total += t[rows][2];
        }
        System.out.println(total);
        total = t[0][2] + t[1][2];
        System.out.println(total);

    }
}
