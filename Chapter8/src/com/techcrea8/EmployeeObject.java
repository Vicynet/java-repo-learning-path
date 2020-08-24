package com.techcrea8;

public class EmployeeObject {
    private static int count = 0; // number of Employees created
    private String firstName;
    private String lastName;

    // initialize Employee, add 1 to static count and
    // output String indicating that constructor was called
    public EmployeeObject (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++count; // increment static count of employees
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
