public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        // int counter;

        // for(counter = 1; counter <= 99; counter++) {
        //    if(counter%2 != 0) {
        //        sum += counter;
        //     }
        // }
        for(int counter = 1; counter <= 99; counter += 2)
        sum += counter;
        System.out.printf("Here's your sum: %d", sum);
        System.out.println();
    }
}