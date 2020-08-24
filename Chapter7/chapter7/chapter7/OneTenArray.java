package chapter7;

public class OneTenArray {
    public static void main(String[] args) {
        //int[] array = new int[11];
        // int[] array1 = new int[100];
        // int counter = 1;

        // for (int count = 1; count < array1.length; count++) {
        //     array1[count] = counter;

        //     if((count) % 10==0) {
                
        //         counter++;
        //         System.out.println();
        //     }
        //     System.out.print(array1[count]);
        // }
        int[] array = new int[21];
        
        for (int count = 1; count < array.length; count++) {
                 if(count % 2==0) {
                     array[count] = 2;
                 }
                 if(count%11==0){
                     System.out.println();
                 }
                 System.out.print(array[count]);
                }
    }
}