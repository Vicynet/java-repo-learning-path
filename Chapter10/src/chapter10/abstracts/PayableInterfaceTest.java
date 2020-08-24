package chapter10.abstracts;

public class PayableInterfaceTest {
    public static void main(String[] args) {

        //Date object
        Date birthDay = new Date(9, 9, 1994);
        Date birthDay1 = new Date(12, 2, 1996);

        // create four-element Payable array
        Payable[] payableObjects = new Payable[4];

        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", birthDay, 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", birthDay1, 1200.00);

        System.out.println("Invoices and Employees processed polymorphically:");
        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "Payment due", currentPayable.getPaymentAmount());
        }
    }
}
