package com.techcrea8;

public class EmployeeObjectTest {
    public static void main(String[] args) {

        // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n", EmployeeObject.getCount());

        EmployeeObject employeeObject1 = new EmployeeObject("Susan", "Baker");
        EmployeeObject employeeObject2 = new EmployeeObject("Bob", "White");

        // show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via employeeObject1.getCount(): %d%n",employeeObject1.getCount());
        System.out.printf("via employeeObject2.getCount(): %d%n",employeeObject2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", EmployeeObject.getCount());

        // get names of Employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", employeeObject1.getFirstName(),
                employeeObject1.getLastName(), employeeObject2.getFirstName(), employeeObject2.getLastName());

    }
}
