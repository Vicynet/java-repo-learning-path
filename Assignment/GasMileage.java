import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      double mileagePerTrip = 0;
      double totalMileage = 0;
      int tripCounter = 0;
      
      System.out.print("Enter Miles Driven For This Trip or -1 to quit: ");
      int milesDriven = input.nextInt();
     
      while (milesDriven != -1) {

        System.out.print("Enter Volume of Gas Used For This Trip or -1 to quit: ");
        int gallonsOfGas = input.nextInt();

        mileagePerTrip = (double)(milesDriven/gallonsOfGas);
        totalMileage += mileagePerTrip;
        ++tripCounter;

        System.out.printf("Mileage for trip %d is: %.2f%n", tripCounter, mileagePerTrip);

        System.out.print("Enter Miles Driven For This Trip or -1 to quit: ");
        milesDriven = input.nextInt();
      }

      if (tripCounter != 0) {
       // totalMileage = (double)mileagePerTrip/tripCounter;
       double allTotalMileage = totalMileage/tripCounter;
        
        System.out.printf("Total Mileage for all %d Trips are: %.2f%n", tripCounter, allTotalMileage);
      }
      else
      System.out.print("No trips were taken");
      
      input.close();
    
    }
}