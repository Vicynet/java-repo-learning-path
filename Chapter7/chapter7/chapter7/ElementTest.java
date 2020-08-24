package chapter7;

/**
 * ElementTest
 */
public class ElementTest {
    public static void main(String[] args) {
        int total = 0;
        int[][] a={{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};//declaration and initialization   
        System.out.println("Two dimensional array elements are");  
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                total += a[i][j];
            }
        }  
        System.out.println(total);

            
    }

}

