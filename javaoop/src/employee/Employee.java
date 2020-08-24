package employee;

public class Employee {
	private String firstName;
	private String lastName;
	private String ssn;
	private CompensationModel compensate;
	
	public Employee(String firstName, String lastName, String ssn, CompensationModel compensate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.compensate = compensate;
	}
	
	public Compensation earning() {
		return compensate.earning();
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CompensationModel getCompensate() {
		return compensate;
	}

	public void setCompensate(CompensationModel compensate) {
		this.compensate = compensate;
	}
}
