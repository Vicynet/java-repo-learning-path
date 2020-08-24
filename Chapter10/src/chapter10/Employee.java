package chapter10;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {

        // implicit call to Object's default constructor occurs here
        // if salary is invalid throw exception

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n",
                "Commission employee", getFirstName(), getLastName(),
                "Social security number", getSocialSecurityNumber());
    }
}
