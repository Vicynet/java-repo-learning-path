import java.security.SecureRandom; 
import java.util.Scanner;
  
class WhileGuessGame { 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
     
        SecureRandom random = new SecureRandom();
        int randomNumber = 1;
        int guessNumber = 0;

        while (guessNumber != randomNumber) {
            randomNumber = 1 + random.nextInt(10);

            System.out.print("\nEnter your guess number: ");
            guessNumber = input.nextInt();

            System.out.println("Random Integers: "+ randomNumber); 
 
            if (guessNumber == randomNumber){
                System.out.println("Congratulations, You guessed correctly!");
            }
            else if (guessNumber > randomNumber) {
                System.out.println("Too high, try again.");
            }
            else {
                System.out.println("Too low, try again");
            }
        }
        input.close();
    } 
}