import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner gradeinput = new Scanner(System.in);

        //String grade = " ";

        System.out.println("Enter Student Score: ");
        int studentScore = gradeinput.nextInt();

       /* if (studentScore >= 90){
            System.out.println("A");
        }
        else if (studentScore >= 80) {
            System.out.println("B");
        }
        else if (studentScore >= 70) {
            System.out.println("C");
        }
        else if (studentScore >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }*/
        System.out.println((studentScore >= 90) ? "A j" : (studentScore >= 80) ? "B jh" : (studentScore >= 70) ? "C" : (studentScore >= 60) ? "D hj" : "F");
        gradeinput.close();
    }
}