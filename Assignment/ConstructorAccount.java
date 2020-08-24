public class ConstructorAccount {
	private String name;
	private double balance;

	public ConstructorAccount(String name, double balance){
		this.name = name;

	if (balance > 0.0)
		this.balance = balance;
	}
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.print("Withdrawal amount exceeds account balance\n");
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getName(){
	return name;
	}
}