public class MultiplicationTable {
    public static void main(String[] args) {

        int numberCounter = 1;
        int tabCounter = 1;

        System.out.println("N" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N\n");

        while (numberCounter <= 5 && tabCounter <=5){
        
            System.out.println(tabCounter++ + "\t" + numberCounter*10 + "\t" + numberCounter*100 + "\t" + numberCounter*1000);

            numberCounter++;
         }
    }
}