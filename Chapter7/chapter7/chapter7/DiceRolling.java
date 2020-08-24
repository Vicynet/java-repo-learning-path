package chapter7;

import java.security.SecureRandom;
import java.util.Random;

public class DiceRolling {
    private static SecureRandom dice = new SecureRandom();
    public static void main(String[] args) {
        diceRoll();
    }

    public static void diceRoll() {
        int firstDice;
        int secondDice;
        int sum;
        int[] sumFrequency = new int[13];
        for (int i = 1; i < 36000000; i++) {
            firstDice = dice.nextInt(6) + 1;
            secondDice = dice.nextInt(6) + 1;
            sum = firstDice + secondDice;
            System.out.printf("%s%5d%5d","Roll", i, sum);
            System.out.println();
            ++sumFrequency[sum];
        }
        System.out.println();
        System.out.println("Dice Sum Appearance");
        for (int diceSum = 2; diceSum < sumFrequency.length; diceSum++) {
            System.out.printf("%-5d%10d", diceSum, sumFrequency[diceSum]);
            System.out.println();
        }
    }
}
