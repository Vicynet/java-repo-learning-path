import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        double totalSales = 0; // sum of products sold
        //int productCounter = 0; // number of products entered
        int salesCounter = 0;
        int quantity = 0;
        double product1 = 2.98; 
        double product2 = 4.50; 
        double product3 = 9.98; 
        double product4 = 4.49; 
        double product5 = 6.87; 
        int productCounter1 = 0;
        int productCounter2 = 0;
        int productCounter3 = 0;
        int productCounter4 = 0;
        int productCounter5 = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%s%n %s%n %s", "Enter any integer number in the range 1-5 to buy a product.",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter: ");

        // loop until user enters the end-of-file indicator
    while (input.hasNext()) {
            int product = input.nextInt(); // read product
            System.out.print("\nEnter quantity: ");
            quantity = input.nextInt();
            System.out.printf("%n%s%n%s%n %s%n %s", "Enter any integer number in the range 1-5 to buy a product.",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter: ");
        ++salesCounter;
            
            // increment appropriate product counter
        switch (product) {
            case 1:  // sale of product1
            totalSales += product1*quantity;
           // ++salesCounter;
           ++productCounter1;
            break; // exits switch
            case 2: // sale of product2
            totalSales += product2*quantity;
            //++salesCounter;
            ++productCounter2;
            break; // exits switch
            case 3: // sale of product3
            totalSales += product3*quantity;
            //++salesCounter;
            ++productCounter3;
            break; // exits switch
            case 4: // sale of product4
            totalSales += product4*quantity;
            //++salesCounter;
            ++productCounter4;
            break; // exits switch
            default: // sale of product5
            totalSales += product5*quantity;
            //++salesCounter;
            ++productCounter5;
            break; // optional; exits switch anyway
        } // end switch
    } // end while
    
    
   
    // if user entered at least one product...
    if (salesCounter != 0) {
    // output summary of results
         System.out.printf("\nTotal of the %d products sold is %.2f%n", salesCounter, totalSales);
    
         System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of individual product sold:",
         "Product1: ", productCounter1, // display how many times product1 was purchased
         "Product2: ", productCounter2, // display how many times product2 was purchased
         "Product3: ", productCounter3, // display how many times product3 was purchased
         "Product4: ", productCounter4, // display how many times product4 was purchased
         "Product5: ", productCounter5); // display how many times product5 was purchased
     } // end if
     else // no product was purchased, so output appropriate message
        System.out.println("No products were purchased");
         input.close();
    } // end main
 } // end class Sales