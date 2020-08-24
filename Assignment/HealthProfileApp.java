import java.util.Scanner;

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner healthProfile = new Scanner(System.in);

        HealthProfile hp = new HealthProfile("firstName", "lastName", "gender", 2, 2, 1880, 6.1, 60.5);

        System.out.print("Enter your firstname: ");
        String firstName = healthProfile.nextLine();
        hp.setFirstName(firstName);

        System.out.print("Enter your lastname: ");
        String lastName = healthProfile.nextLine();
        hp.setLastName(lastName);

        System.out.print("Enter your gender: ");
        String gender = healthProfile.nextLine();
        hp.setGender(gender);

        System.out.print("Enter your day of birth (e.g 9): ");
        int day = healthProfile.nextInt();
        hp.setDay(day);

        System.out.print("Enter your month of birth (e.g 12): ");
        int month = healthProfile.nextInt();
        hp.setMonth(month);

        System.out.print("Enter your year of birth (e.g 1880): ");
        int year = healthProfile.nextInt();
        hp.setYear(year);

        System.out.print("Enter your height in inches: ");
        double height = healthProfile.nextDouble();
        hp.setHeight(height);

        System.out.print("Enter your weight in pounds: ");
        double weight = healthProfile.nextDouble();
        hp.setWeight(weight);

        System.out.printf("Maximum Heart Rate, Target Heart Rate and BMI for %S %S (%s) with age %d is: %dbpm, %dbmp, %.2f", hp.getFirstName(), hp.getLastName(), hp.getGender(), hp.ageCalculator(), hp.maxHeartRate(), (int)hp.targetHeartRate(), hp.bmi());
        System.out.println("\n\nBMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater");
        healthProfile.close();
    }
}