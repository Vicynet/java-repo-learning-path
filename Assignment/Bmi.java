import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        float height = bmi.nextInt();

        System.out.print("Enter your weight in pounds: ");
        float weight = bmi.nextInt();
        
        float bmiCalculator = (weight/(height*height))*703;
        
        System.out.printf("Your BMI is: %.2f", bmiCalculator);
        System.out.println("\n\nBMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater");
        bmi.close();
    }
}