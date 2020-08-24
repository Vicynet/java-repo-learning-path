import java.security.SecureRandom;
public class SequenceRandom {
    private static int randNumber;
    private static SecureRandom genRand = new SecureRandom();
    public static void main(String[] args) {
        
        randNumber = 2 + 2 * genRand.nextInt(5);
            
        System.out.print(randNumber + " ");
        System.out.println();
        
        randNumber = 3 + 2 * genRand.nextInt(5);
           
        System.out.print(randNumber + " ");
    }
}