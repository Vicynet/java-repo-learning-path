package chapter10;
public class PolymorphismTest {
    public static void main(String[] args) {

        // assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Bob", "Lewis", "333-33-3333",
                5000, .04);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Lekwa", "eme", "255-56-0989",
                2000, .06, 300);

        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",  basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee1 = new BasePlusCommissionEmployee(
                "Victor", "Ihedioha", "109-23-2357",
                9000, .09, 500);
        System.out.printf("%s %s:%n%n%s%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee1.toString());
    }
}
