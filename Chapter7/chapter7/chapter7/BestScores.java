package chapter7;

public class BestScores {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int showCounts : counts) {
            System.out.print(showCounts);
        }
        System.out.println();
        int[] bonus = new int[15];
        for (int newBonus  : bonus) {
            newBonus = 1;
            System.out.print(newBonus);
        }
        System.out.println();

        int[] bestScores = new int[5];
        System.out.println("Best Scores");
        for (int newBestScores : bestScores) {
            newBestScores = 2;
            System.out.println(newBestScores);
        }
    }
}
