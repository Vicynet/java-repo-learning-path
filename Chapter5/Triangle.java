public class Triangle {
    public static void main(String[] args) {
        // for (int column = 1; column <= 10; column++) {
        //     for (int row = 10; row >= column; row--) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // for (int column = 1; column <= 10; column++) {
        //     for (int row = 1; row <= column; row++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        // for (int column = 1; column <= 10; column++) {
        //     for (int space = 1; space <= column; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int row = 10; row >= column; row--) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
        for (int column = 1; column <= 10; column++) {
            for (int space = 10; space >= column; space--) {
                System.out.print(" ");
            }
            for (int row = 1; row <= column; row++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}