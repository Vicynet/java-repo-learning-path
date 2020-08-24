import java.util.Scanner;

public class CarPool {
    public static void main(String[] args) {
        Scanner carPool = new Scanner(System.in);

        System.out.print("Enter Your Total Miles Driven: ");
        float milesDriven = carPool.nextFloat();

        System.out.print("Enter Cost per gallon: ");
        float costPerGallon = carPool.nextFloat();

        System.out.print("Enter Average Miles per Gallon: ");
        float milesPerGallon = carPool.nextFloat();

        System.out.print("Enter Parking Fees For Today: ");
        float parkingFees = carPool.nextFloat();
        
        System.out.print("Enter Number Of Tolls Today: ");
        float tollNumber = carPool.nextFloat();

        float drivingCostPerDay = ((costPerGallon/milesPerGallon)*milesPerGallon) + parkingFees;
        
        System.out.printf("Your Driving Cost Per Day is: $%.2f", drivingCostPerDay);
        carPool.close();
    }
}