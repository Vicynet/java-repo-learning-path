import java.util.Scanner;
import java.util.Timer;
public class Timers {
    public static void main(String[] args) throws InterruptedException {
        int trackQuestions = 0;
        int score = 0;
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("How much you want the counterdown count?");
        int tim = getInput.nextInt();
        do{
            Thread.sleep(1000);
            System.out.println(tim);
            tim = tim - 1;
        }
        while (tim != 0);
        System.out.println("Time's Up!");
    }
}
