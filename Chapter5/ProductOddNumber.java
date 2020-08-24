public class ProductOddNumber {
    public static void main(String[] args) {
        int product = 1;
        // int counter;

        // for(counter = 1; counter <= 15; counter++) {
        //    if(counter%2 != 0) {
        //        sum *= counter;
        //     }
        // }
        for(int counter = 1; counter <=15; counter += 2)
        product *= counter;
        System.out.printf("Here's your product: %,d", product);
        System.out.println();
    }
}