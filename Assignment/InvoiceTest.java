import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        
        Invoice invoicer = new Invoice("PartNo-0001", "24 Inch ScrewDriver", 0, 0.0);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Part Number: ");
		String partNumber = input.nextLine();
        invoicer.setPartNumber(partNumber);
        System.out.printf("The part number is: %s%n ", invoicer.getPartNumber());

        System.out.print("\nEnter Part Description: ");
		String partDescription = input.nextLine();
        invoicer.setPartDescription(partDescription);
        System.out.printf("The description is: %s%n ", invoicer.getPartDescription());

        System.out.print("\nEnter Quantity: ");
		int itemQuantity = input.nextInt();
        invoicer.setItemQuantity(itemQuantity);
        System.out.printf("The quantity: %s%n", invoicer.getItemQuantity());

        System.out.print("\nEnter Price: ");
		double itemPrice = input.nextDouble();
        invoicer.setItemPrice(itemPrice);
        System.out.printf("The price: %s%n", invoicer.getItemPrice());

        System.out.printf("\nTotal Invoice Amount: %s%n", invoicer.getInvoiceAmount());

        input.close();
    }
}