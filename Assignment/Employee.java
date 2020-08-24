public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
        System.out.print("Proper salary amount not specified, try again\n");
        this.monthlySalary = 0;
        }
        else
        this.monthlySalary = monthlySalary*12;
       
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getSalaryIncrease() {
        double monthlySalaryIncrease = monthlySalary/100*10 + monthlySalary;
        return monthlySalaryIncrease;
    }
    
}