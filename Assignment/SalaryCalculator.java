import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      Scanner input2 = new Scanner(System.in);

      int employeeCounter = 1;
      int workHours = 40;
      int payPerHour = 300;
      double grossPay = 0;
     
      while (employeeCounter <= 3) {

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Extra Work Hour(s), If Any: ");
        int extraWorkHours = input2.nextInt();

        grossPay = workHours * payPerHour + extraWorkHours * payPerHour * 1.5;

        System.out.printf("Gross Pay For %S Employee is: %.2f%n", employeeName, grossPay);

        employeeCounter++;
    }
    input.close();
    input2.close();
    }
}