import java.util.Scanner;

public class ConstructorAccountTest {
	public static void main(String... args) {

		ConstructorAccount account1 = new ConstructorAccount("Jane Green", 50.00);
		ConstructorAccount account2 = new ConstructorAccount("John Blue", -7.53);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		System.out.print("\nEnter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		System.out.print("\nEnter withdrawal amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nWithdrawing $%.2f from account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

		input.close();
	}
}