import java.util.Scanner;

public class EmployeeTest {
	public static void main(String... args) {

		Employee salary1 = new Employee("Jane", "Green", 50.00);
		Employee salary2 = new Employee("John", "Blue", 7.53);

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

		System.out.print("\nEnter FirstName For First Employee: ");
        String firstName = input.nextLine();
        salary1.setFirstName(firstName);
        System.out.print("Enter LastName For First Employee: ");
        String lastName = input.nextLine();
        salary1.setLastName(lastName);
        System.out.print("Enter Monthly Salary For First Employee: ");
        double monthlySalary = input.nextDouble();
        salary1.setMonthlySalary(monthlySalary);
        System.out.printf("%s %s Yearly Salary is: $%.2f%n", salary1.getFirstName(), salary1.getLastName(), salary1.getMonthlySalary());
        System.out.printf("%s %s 10 Percent Yearly Salary Increase is: $%.2f%n", salary1.getFirstName(), salary1.getLastName(), salary1.getSalaryIncrease());

        input.close();

		System.out.print("\nEnter FirstName For Second Employee: ");
        firstName = input2.nextLine();
        salary2.setFirstName(firstName);
        System.out.print("Enter LastName For Second Employee: ");
        lastName = input2.nextLine();
        salary2.setLastName(lastName);
        System.out.print("Enter Monthly Salary For First Employee: ");
        monthlySalary = input2.nextDouble();
        salary2.setMonthlySalary(monthlySalary);
        System.out.printf("%s %s Yearly Salary is: $%.2f%n", salary2.getFirstName(), salary2.getLastName(), salary2.getMonthlySalary());

        System.out.printf("%s %s 10 Percent Yearly Salary Increase is: $%.2f%n", salary2.getFirstName(), salary2.getLastName(), salary2.getSalaryIncrease());
    
        input2.close();
    }
}