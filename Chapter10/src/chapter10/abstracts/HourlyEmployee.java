package chapter10.abstracts;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    //Constructor

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0.0) {
            throw new IllegalArgumentException("Wage must be greater or equal to 0.0");
        }
        if(hours <  0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Wage must be between 0.0 and 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0) {
            throw new IllegalArgumentException("Wage must be greater or equal to 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours <  0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Wage must be between 0.0 and 168.0");
        }
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40) { // no overtime
            return getWage() * getHours();
        }
        else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString()
    {
        return String.format("Hourly employee: %s%n%s: $%,.2f%n%s: %,.2f",
                super.toString(), "Hourly wage", getWage(),
                "Hours worked", getHours());
    }
}
