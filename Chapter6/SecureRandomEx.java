import java.security.SecureRandom;
public class SecureRandomEx {
    public static void main(String[] args) {
        SecureRandom genRand = new SecureRandom();

        for (int count = 1; count <= 20; count++) {
            int randNumber = 1 + genRand.nextInt(6);
            
            System.out.print(randNumber+" ");
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}