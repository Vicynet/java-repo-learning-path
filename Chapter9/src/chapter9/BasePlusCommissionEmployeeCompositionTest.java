package chapter9;

public class BasePlusCommissionEmployeeCompositionTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Bob", "Lewis", "333-33-3333",
                5000, .04);

        BasePlusCommissionEmployeeComposition baseEmployees =
                new BasePlusCommissionEmployeeComposition(
                        commissionEmployee, 300);

        System.out.println(baseEmployees);
        System.out.println(commissionEmployee.earnings());
        System.out.println(baseEmployees.earnings());
    }
}
