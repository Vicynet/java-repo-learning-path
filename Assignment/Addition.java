//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition {

	public static void main(String... args) {

		//Scanner input = new Scanner(System.in);

		//int number1, number2, sum;

		//System.out.print("Enter First Integer: ");
		//number1 = input.nextInt();

		//System.out.print("Enter Second Integer: ");
		//number2 = input.nextInt();

		//sum = number1 + number2;

		//System.out.printf("Sum is %d%n", sum);

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Integer"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Integer"));

		int sum = number1 + number2;

		String message = String.format("Sum is: %s", sum);
		JOptionPane.showMessageDialog(null, message);
	}
}