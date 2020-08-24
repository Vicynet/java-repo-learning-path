package chapter9;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must not be negative or greater than 168");
        }
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wages must nbe a non-negative value");
        }

        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must not be negative or greater than 168");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wages must nbe a non-negative value");
        }
        this.wage = wage;
    }

    public double earnings() {
        return getWage() * getHours();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                super.toString(), "Hours worked", getHours(),
                "Wages per hour", getWage(), "Total Wages", earnings());
    }
}
