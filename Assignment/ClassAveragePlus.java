import java.util.Scanner;

public class ClassAveragePlus {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int total = 0;
      int gradeCounter = 0;
      
      System.out.print("Enter Grade to compute or -1 to quit: ");
      int grade = input.nextInt();
     
      while (grade != -1) {
        total += grade;
        ++gradeCounter;

        System.out.print("Enter Grade to compute or -1 to quit: ");
        grade = input.nextInt();  
      }

      if (gradeCounter != 0) {
        double average = (double)total/gradeCounter;
        System.out.printf("Total of the %d grades entered is: %d%n", gradeCounter, total);
        System.out.printf("Class Average is: %.2f%n", average);
      }
      else
      System.out.print("No grades were entered");
      
      input.close();
    
    }
}