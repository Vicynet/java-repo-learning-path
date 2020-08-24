package chapter7;

/**
 * Table
 */
public class Table {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
        int tlength = 0;

        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++)
                table[0][0] = 1;
                table[0][1] = 2;
                table[0][2] = 3;
                table[1][0] = 4;
                table[1][1] = 5;
                table[1][2] = 6;
                table[2][0] = 7;
                table[2][1] = 8;
                table[2][2] = 9;
                //table[i][j] = i+j;
                tlength = tlength + table.length;
        }
        System.out.println(tlength);
        for (int[] s : table) {
            for (int t : s)
            System.out.print(t);
            System.out.println();
        }
        System.out.println(table.length);
    }
}