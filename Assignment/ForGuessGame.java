import java.security.SecureRandom; 
import java.util.Scanner;
  
class ForGuessGame { 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
       // create instance of Random class 
        SecureRandom random = new SecureRandom();
        int randomNumber = 1;
        
        for(int guessNumber = 0; guessNumber != randomNumber;) {
            randomNumber = 1 + random.nextInt(10);

            System.out.print("\nEnter your lucky number: ");
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