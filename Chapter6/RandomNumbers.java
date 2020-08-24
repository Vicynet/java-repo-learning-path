import java.security.SecureRandom;
public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom genRand = new SecureRandom();

        int randNumber = 1 + genRand.nextInt(2);
        System.out.println(randNumber);
        randNumber = 1 + genRand.nextInt(100);
        System.out.println(randNumber);
        randNumber = genRand.nextInt(10);
        System.out.println(randNumber);
        randNumber = 1000 + genRand.nextInt(112);
        System.out.println(randNumber);
        randNumber = -1 + genRand.nextInt(3);
        System.out.println(randNumber);
        randNumber = -3 + genRand.nextInt(14);
        System.out.println(randNumber);
        for (int count = 1; count <= 10; count++) {
            randNumber = 0 + genRand.nextInt(10) * 2;
            System.out.print(randNumber + " ");
        }
       
    }
}