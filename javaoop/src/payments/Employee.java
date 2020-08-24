package payments;

import java.math.BigDecimal;


public class Employee implements Payable {
	private int id;
	private String firstName;
	private String lastName;
	private BigDecimal salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, BigDecimal salary) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public abstract BigDecimal calculatePayment() {
		//return BigDecimal.ZERO;
		return this.getSalary() * 12;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


}
