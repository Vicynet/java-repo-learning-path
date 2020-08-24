public class BreakExample {
    public static void main(String[] args) {
        int count;
        int tot = 6;

        for (count = 1; count <= 20; count++) {
            tot = tot + count + 2;
            if (tot == 21) 
               continue;
               System.out.printf("At count %d, with %d, Sum %d%n", count, count+1, tot);
               tot = count + 6;
        }
        System.out.printf("%nBroke out of loop at Count %d when Sum = %d%n", count, tot);
    }
}