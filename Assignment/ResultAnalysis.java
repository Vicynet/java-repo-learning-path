import java.util.Scanner;

public class ResultAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int inputCount = 0;


        while (studentCounter <= 10 && inputCount <=10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes += 1; 
                studentCounter += 1;  
            } 
            else if (result == 2) {
                failures += 1; 
                studentCounter += 1;
            }
            else {
                System.out.print("Enter either 1 or 2\n");
                inputCount++;
            }
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
        input.close();
    }
}