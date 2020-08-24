package employee;

public class CommissionCompensationModel extends CompensationModel {
	private double grossSales;
	private double commissionRate;
	
	public CommissionCompensationModel (double sales, double comRate) {
		grossSales = sales;
		commissionRate = comRate;
	}
	
	@Override
	public double earning() {
		grossSales = 1;
		commissionRate = 4;
		return grossSales * commissionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
