import java.security.SecureRandom;
public class SecureRandomEx2 {
    public static void main(String[] args) {
        SecureRandom dieRoll = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        for (int roll = 1; roll <= 6000000; roll++) {
            int dieSides = 1 + dieRoll.nextInt(6);

            switch (dieSides) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("DieNumber\tDieRolls");
        System.out.print("1\t\t"+ frequency1 +"\n2\t\t"+ frequency2 +"\n3\t\t"+ frequency3 +"\n4\t\t"+ frequency4 +"\n5\t\t"+ frequency5 +"\n6\t\t"+ frequency6);
    }
}