package chapter7;

import java.util.Scanner;
import java.util.ArrayList;
public class SumDynamicArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter Number: ");
            myArrayList.add(input.nextInt());
            sum += myArrayList.get(i);
        }
        System.out.println(sum);
        System.out.print(myArrayList + " ");
        System.out.println(myArrayList.indexOf(1));
        input.close();
    }
}