import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter Number of iteration: ");
        int iteration = take.nextInt();
        int smallNumber = iteration;

        for (int iterate = 1; iterate <= iteration; iterate++) {
            System.out.println("Enter Number: ");
            int number = take.nextInt();
            
            if (number < smallNumber) {
                smallNumber = number;
            }
        }
        System.out.println(smallNumber);
        take.close();
    }
}