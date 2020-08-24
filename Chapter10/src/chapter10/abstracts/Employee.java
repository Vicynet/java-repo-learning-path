package chapter10.abstracts;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {

        //Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
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

    // return String representation of Employee object
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%s %s%n%s: %s%n%s: %s",
                getFirstName(), getLastName(),
                "Social security number", getSocialSecurityNumber(), "Birthday", birthDate);
    }

    // abstract method must be overridden by concrete subclasses
//    public abstract double earnings(); // no implementation here
}
