package employee;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
	private double baseSalary;

	public BasePlusCommissionCompensationModel(double sales, double comRate, double baseEarning) {
		super(sales, comRate);
		baseSalary = baseEarning;
		// TODO Auto-generated constructor stub
	}
	
	
	public double earning() {
		baseSalary = 1;
		return baseSalary + super.earning();
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	

}
