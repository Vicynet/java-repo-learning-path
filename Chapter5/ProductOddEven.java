public class ProductOddEven {
    public static void main(String[] args) {
        long productOdd = 1;
        long productEven = 1;

        // for(int counter = 1; counter <= 5; counter++) {
        //    if(counter%2 != 0) {
        //        productOdd *= counter;
        //     }
        //     else {
        //         productEven *= counter;
        //     }
        // }
        // System.out.printf("%nHere's your Odd product: %,d%n", productOdd);

        // System.out.printf("%nHere's your Even product: %,d%n", productEven);
        for(int counter = 1; counter <= 5; counter += 2) {
            productOdd *= counter;
        }
        for(int counter = 4; counter > 1; counter -= 2) {
            productEven *= counter;
        }
        System.out.printf("%nHere's your Odd product: %,d%n", productOdd);

        System.out.printf("%nHere's your Even product: %,d%n", productEven);
    }
}