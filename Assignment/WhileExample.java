public class WhileExample {
    public static void main(String[] args) {
        int counter = 1;

        /*while (counter < 5) {
            System.out.printf("%d. Hello Nigeria\n", counter + 1);
            counter++;
        }*/
        while (counter <= 5) {
            
            if (counter == 3) {
                System.out.println(counter +". Hello Nigeria, How are you doing?");
                counter++;
            }
            System.out.printf("%d. Hello Nigeria\n", counter);
            counter++;
            /*System.out.printf("%d. Hello Nigeria\n", counter);
            counter++;
            if (counter == 3) {
                counter--;
                counter++;
                System.out.println(counter +". Hello Nigeria, How are you doing?");
                counter++;
            }*/
            
           
        }
    }
}