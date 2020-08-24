package chapter10.abstracts;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be greater or equal to 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be greater or equal to 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // calculate earnings; implement interface Payable method that was
    // abstract in superclass Employee
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format("Salaried employee: %s%n%s: $%,.2f",
                super.toString(), "Weekly salary", getWeeklySalary());
    }
}
