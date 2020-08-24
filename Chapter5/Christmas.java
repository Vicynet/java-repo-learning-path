import java.util.Scanner;
public class Christmas {
    public static void main(String[] args) {
        int counter = 1;
        int songNumber = 0;
       

        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%s%n %s%n %s", "Enter any integer number in the range 1-5 to buy a product.",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter: ");

        // loop until user enters the end-of-file indicator
        while (input.hasNext()) {
            songNumber = input.nextInt(); // read product
        
            // increment appropriate product counter
        switch (songNumber) {
            case 1:  
            System.out.println("\nFirst Day: \n");
            System.out.printf("%s%n%s%n%s%n", "On the first day of Christmas",
            "My true love gave to me","A partridge in a pear tree");
            break; // exits switch
            case 2:
            System.out.println("\nSecond Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n","On the second day of Christmas",
            "My true love gave to me","Two turtle doves", "And a partridge in a pear tree");
            break; // exits switch
            case 3:
            System.out.println("\nThird Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n","On the third day of Christmas",
            "My true love gave to me","Three French hens","Two turtle doves",
            "And a partridge in a pear tree");
            break; // exits switch
            case 4:
            System.out.println("\nFourth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","On the fourth day of Christmas",
            "My true love gave to me","Four calling birds","Three French hens","Two turtle doves",
            "And a partridge in a pear tree");
            break; // exits switch
            case 5:
            System.out.println("\nFifth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n","On the fifth day of Christmas, My true love gave to me",
            "Five gold rings, Four calling birds", "Three French hens, Two turtle doves",
            "And a partridge in a pear tree");
            break; // exits switch
            case 6:
            System.out.println("\nSixth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n","On the sixth day of Christmas, My true love gave to me",
            "Six geese a laying, Five gold rings", "Four calling birds, Three French hens",
            "Two turtle doves, And a partridge in a pear tree");
            break; // exits switch
            case 7:
            System.out.println("\nSeventh Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n","On the seventh day of Christmas, My true love gave to me",
            "Seven swans a swimming, Six geese a laying", "Five gold rings, Four calling birds",
            "Three French hens, Two turtle doves", "And a partridge in a pear tree");
            break; // exits switch
            case 8:
            System.out.println("\nEighth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n","On the eighth day of Christmas, My true love gave to me",
            "Eight maids a milking, Seven swans a swimming", "Six geese a laying, Five gold rings",
            "Four calling birds, Three French hens", "Two turtle doves, And a partridge in a pear tree");
            break; // exits switch
            case 9:
            System.out.println("\nNineth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","On the ninth day of Christmas, Me me me me me me",
            "Nine ladies dancing, Eight maids a milking", "Seven swans a swimming, Six geese a laying",
            "Five gold rings, badam-pam-pam, Four calling birds", "Three French hens, Two turtle doves",
            "And a partridge in a pear tree");
            break; // exits switch
            case 10:
            System.out.println("\nTenth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n","On the tenth day of Christmas, My true love gave to me",
            "Ten lords a leaping, Nine ladies dancing", "Eight maids a milking, Seven swans a swimming",
            "Six geese a laying, Five gold rings, badam-pam-pam", "Four calling birds, Three French hens",
            "Two turtle doves, And a partridge in a pear tree");
            break; // exits switch
            case 11:
            System.out.println("\nEleventh Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","On the eleventh day of Christmas, My true love gave to me",
            "Eleven pipers piping, Ten lords a leaping", "Nine ladies dancing, Eight maids a milking",
            "Seven swans a swimming, Six geese a laying", "Five gold rings, badam-pam-pam",
            "Four calling birds, Three French hens", "Two turtle doves", "And a partridge in a pear tree");
            break; // exits switch
            default:
            System.out.println("\nTwelfth Day: \n");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","On the twelfth day of Christmas, My true love gave to me",
            "12 drummers drumming, Eleven pipers piping", "Ten lords a leaping, Nine ladies dancing",
            "Eight maids a milking, Seven swans a swimming", "Six geese a laying, Five gold rings, badam-pam-pam",
            "Four calling birds, Three French hens", "Two turtle doves",
            "And a partridge in a pear tree");
            break; // optional; exits switch anyway
           
        } // end switch
        counter++;

        System.out.printf("%n%s%n%s%n %s%n %s", "Enter any integer number in the range 5 to buy a product.",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter: ");
    } // end while
    
    
   
    // if user entered at least one product...
    if (counter != 0) {
    // output summary of results
         System.out.printf("\nTotal of the %d products sold is %.2f%n");
    
        //  System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of individual product sold:",
        //  "Product1: ", productCounter1, // display how many times product1 was purchased
        //  "Product2: ", productCounter2, // display how many times product2 was purchased
        //  "Product3: ", productCounter3, // display how many times product3 was purchased
        //  "Product4: ", productCounter4, // display how many times product4 was purchased
        //  "Product5: ", productCounter5); // display how many times product5 was purchased
     } // end if
     else // no product was purchased, so output appropriate message
        System.out.println("No products were purchased");
         input.close();
    } // end main
 } // end class Sales