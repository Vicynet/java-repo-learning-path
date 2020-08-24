package chapter10.abstracts;

public class PayrollSystemTest {
    public static void main(String[] args) {

        //create employee data object
        Date birthDay = new Date(9, 9, 1994);
        Date birthDay1 = new Date(2, 3, 1992);
        Date birthDay2 = new Date(4, 6, 1991);
        Date birthDay3 = new Date(5, 8, 1990);

        Date currentDate = birthDay;


        // create subclass objects
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", birthDay, 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", birthDay1, 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", birthDay2, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", birthDay3, 5000, .04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "Earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "Earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "Earned", commissionEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.getPaymentAmount());

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee birthdayEmployee : employees) {
            System.out.println(birthdayEmployee);

            if (birthDay.equals(currentDate)) {
                SalariedEmployee employee = (SalariedEmployee) birthdayEmployee;
                employee.setWeeklySalary(100 + employee.getWeeklySalary());

                System.out.printf("New base salary with 10%% increase is: $%,.2f%n",
                        employee.getWeeklySalary());
            }
            System.out.printf("Earned $%,.2f%n%n", birthdayEmployee.getPaymentAmount());
        }

//
//        // generically process each element in array employees
//        for (Employee currentEmployee : employees) {
//            System.out.println(currentEmployee); // invokes toString
//
//            // determine whether element is a BasePlusCommissionEmployee
//            if (currentEmployee instanceof BasePlusCommissionEmployee) {
//                // downcast Employee reference to
//                // BasePlusCommissionEmployee reference
//                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//
//                employee.setBaseSalary(1.10 * employee.getBaseSalary());
//
//                System.out.printf("New base salary with 10%% increase is: $%,.2f%n",
//                        employee.getBaseSalary());
//            } // end if
//            System.out.printf("Earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
//        } //end for

        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
}
