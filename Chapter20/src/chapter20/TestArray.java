package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        int[][] c = new int[3][3];
        int[][] a = {{23, 43, 34},{24, 25, 45},{1, 1, 1}};
        int[][] b = {{12, 1, 23},{13, 13, 1},{1, 1, 1}};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
