import java.util.Scanner;

public class DateTest {
	public static void main(String... args) {

		Date newDate = new Date(12, 31, 2019);

        Scanner input = new Scanner(System.in);

		System.out.print("\nEnter Month In Figure: ");
        int month = input.nextInt();
        newDate.setMonth(month);
        System.out.print("Enter Day In Figure: ");
        int day = input.nextInt();
        newDate.setDay(day);
        System.out.print("Enter Year In Figure: ");
        int year = input.nextInt();
        newDate.setYear(year);
        System.out.printf("The date you entered is: %d/%d/%d%n", newDate.getMonth(), newDate.getDay(), newDate.getYear());
	}
}