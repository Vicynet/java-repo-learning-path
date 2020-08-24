import java.util.Scanner;
public class ParkingCharges {
    private static double runningTotal = 0;
    private static double runningTotal2 = 0;
    private static double minParkingFee = 2.0;
    private static double maxParkingFee = 10.0;
    private static Scanner collect = new Scanner(System.in);
    private static int parkedHours;
    public static void main(String[] args) {
        calculateCharges();
    }

    public static void calculateCharges() {
        yesterdayCustomer();
        todayCustomer();
    }

    public static void todayCustomer() {
        System.out.print("Enter Hours Parked For Today: ");
        parkedHours = collect.nextInt();
        if (parkedHours != 0) {

        if (parkedHours <= 3) {
            runningTotal = runningTotal + minParkingFee;
            System.out.println("Customer total charge is: " + runningTotal);
        }
        if (parkedHours == 24) {
            runningTotal = runningTotal + maxParkingFee;
            System.out.println("Customer total charge is: " + runningTotal);
        }
        if (parkedHours > 3 && parkedHours < 24) {
            double extrahour = parkedHours % 3;
            runningTotal = runningTotal + minParkingFee + extrahour * 0.5 ;
            System.out.println("Customer total charge is: " + runningTotal);
        }
        }
        else {
            System.out.println("Customer total charge is: " + runningTotal);
        }
    }
        
    public static void yesterdayCustomer() {
        System.out.print("Enter Hours Parked For Yesterday: ");
        parkedHours = collect.nextInt();
        if (parkedHours != 0) {
        if (parkedHours <= 3) {
            runningTotal2 = runningTotal2 + minParkingFee;
            System.out.println("Customer total charge is: " + runningTotal2);
        }
        if (parkedHours == 24) {
            runningTotal2 = runningTotal2 + maxParkingFee;
            System.out.println("Customer total charge is: " + runningTotal2);
        }
        if (parkedHours > 3 && parkedHours < 24) {
            double extrahour = parkedHours % 3;
            runningTotal2 = runningTotal2 + minParkingFee + extrahour * 0.5 ;
            System.out.println("Customer total charge is: " + runningTotal2);
        }
    }
    else {
        System.out.println("Customer total charge is: " + runningTotal2);
    }
        
    }

}