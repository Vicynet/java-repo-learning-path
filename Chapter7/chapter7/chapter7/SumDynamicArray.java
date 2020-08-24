package chapter7;

import java.util.Scanner;
public class SumDynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++ ) {
            System.out.print("Enter Number: ");
            sum = sum + (myArray[i] = input.nextInt());
        }
        System.out.println(sum);
        for(int showArray : myArray){
            System.out.print(showArray);
        }
        input.close();
    }
}