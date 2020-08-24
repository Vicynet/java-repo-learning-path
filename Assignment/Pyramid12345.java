public class Pyramid12345 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5) {
            int number = 1;
            int space = 5;
            while (space >= counter) {
                space--;
                System.out.print(" ");
                }
            while (number <= counter+counter-1) {
                System.out.print(counter);
                ++number;
            }
            System.out.println(); 
            ++counter;   
        }      
    }
}