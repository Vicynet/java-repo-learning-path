package chapter7;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesCommission {

    private  String salaryType;
    private int[] sales;
    private ArrayList<Double> newSalary = new ArrayList<>();


    public SalesCommission(String salaryType, int[] sales) {
        this.salaryType = salaryType;
        this.sales = sales;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public void showLeaderBoard () {
        System.out.println("Weekly Salary LeaderBoard:");

        int[] leadFrequency = new int[11];

        // for each salary, increment the appropriate leadFrequency
        for (double newSalaries : newSalary) {
            ++leadFrequency[(int) (newSalaries / 100)];
        }
        // for each salary leadFrequency, print bar in chart
        for (int count = 0; count < leadFrequency.length; count++)  {
            // output bar label ("200-299: ", ..., "900-999: ", "1000: ")
                if (count > 1) {
                    System.out.printf("%d-%d: ", count * 100, count * 100 + 99);
                }
            // print bar of asterisks
            for (int stars = 0; stars < leadFrequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // output the contents of the salary array
    public void showSalary() {
        final int baseSalary = 200;
        final double fixedPercentage = 0.09;
        double workerSalary;
        double commission;

        System.out.printf("The salaries are:%n%n");
        for (int worker = 0; worker < sales.length; worker++) {
            commission = sales[worker] * fixedPercentage;
            workerSalary = baseSalary + commission;
            newSalary.add(workerSalary);

            System.out.printf("Worker %2d: %3.2f%n", worker + 1, workerSalary);
        }
    }

    public void processSalary() {
        showSalary();
        showLeaderBoard();
    }
}
