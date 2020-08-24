//Summing the Even Integers from 2 to 20
public class SumEven1To20 {
    public static void main(String[] args){
        int total = 0;
        for (int number = 2; number <= 20; number += 2)
        total += number;
        System.out.printf("Sum is %d ", total);
        System.out.println();
    }
}