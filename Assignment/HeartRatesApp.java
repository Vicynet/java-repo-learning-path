import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner heartMonitor = new Scanner(System.in);

        HeartRates hrm = new HeartRates("firstName", "lastName", 2, 2, 1880);

        System.out.print("Enter your firstname: ");
        String firstName = heartMonitor.nextLine();
        hrm.setFirstName(firstName);

        System.out.print("Enter your lastname: ");
        String lastName = heartMonitor.nextLine();
        hrm.setLastName(lastName);

        System.out.print("Enter your day of birth (e.g 9): ");
        int day = heartMonitor.nextInt();
        hrm.setDay(day);

        System.out.print("Enter your month of birth (e.g 12): ");
        int month = heartMonitor.nextInt();
        hrm.setMonth(month);

        System.out.print("Enter your year of birth (e.g 1880): ");
        int year = heartMonitor.nextInt();
        hrm.setYear(year);

        System.out.printf("Maximum Heart Rate and Target Heart Rate for %S %S with age %d is: %dbpm, %dbmp ", hrm.getFirstName(), hrm.getLastName(), hrm.ageCalculator(), hrm.maxHeartRate(), (int)hrm.targetHeartRate());
        heartMonitor.close();
    }
}