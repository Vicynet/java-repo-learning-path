package chapter7;

public class Exercise7_13 {
    public static void main(String[] args) {
        int[][] sales = new int[3][4];

        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                System.out.printf("[%d][%d]", row, col);
                sales[row][col] = 0;
                System.out.print(sales[row][col]);
                System.out.println();
            }
        }
    }
}
