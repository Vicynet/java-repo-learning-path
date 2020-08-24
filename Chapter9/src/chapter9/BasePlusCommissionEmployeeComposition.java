package chapter9;

public class BasePlusCommissionEmployeeComposition {

    private CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployeeComposition(CommissionEmployee commissionEmployee, double baseSalary) {
        this.commissionEmployee = commissionEmployee;

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",commissionEmployee, "base salary", getBaseSalary());
    }
}
