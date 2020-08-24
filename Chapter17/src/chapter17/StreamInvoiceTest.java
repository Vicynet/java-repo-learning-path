package chapter17;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamInvoiceTest {
    public static void main(String[] args) {
        //Initialize Invoice
        Invoice[] invoices = {
                new Invoice(83, "Electric sander", 7, 57.98),
                new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Sledge hammer", 11, 21.50),
                new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn mower", 3, 79.50),
                new Invoice(68, "Screwdriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50),
               };

        //get invoice record
        List<Invoice> invoiceRecord = Arrays.asList(invoices);

        //show all invoice records
        System.out.printf("%s%n%-13s%-18s%-10s%-10s%n", "Show All Invoice Records",
                "Part_Number", "Part_Description", "Quantity", "Price_Per_Item");
        invoiceRecord.forEach(System.out::println);

        //show records sorted by part description
        System.out.printf("%s%n%-13s%-18s%-10s%-10s%n",
                "Show All Invoice Records, Sorted By Part Description",
                "Part_Number", "Part_Description", "Quantity", "Price_Per_Item");
        invoiceRecord.stream()
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);

        //show records sorted by part price
        System.out.printf("%s%n%-13s%-18s%-10s%-10s%n",
                "Show All Invoice Records, Sorted By Part Price",
                "Part_Number", "Part_Description", "Quantity", "Price_Per_Item");
        invoiceRecord.stream()
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(System.out::println);

        //show records by mapping to part description and quantity, then sort by quantity
        Comparator<Invoice> descriptionQuantity =
                Comparator.comparing(Invoice::getQuantity).thenComparing(Invoice::getPartDescription);

        System.out.printf("%s%n%-13s%-18s%-10s%-10s%n",
                "Map records to description and quantity then sort by quantity",
                "Part_Number", "Part_Description", "Quantity", "Price_Per_Item");
        invoiceRecord.stream()
                .sorted(descriptionQuantity)
                .forEach(System.out::println);


        Map<String, List<Invoice>> groupedByDescription =
                invoiceRecord.stream()
                        .collect(Collectors.groupingBy(Invoice::getPartDescription));

        System.out.printf("%-16s%s%n", "Description", "Total Amount");
        groupedByDescription.forEach(
                (description, invoicer) ->
                        invoicer.forEach(
                                invoiceValue -> System.out.printf("%-15s %s%n",
                                        description,
                                        NumberFormat
                                                .getCurrencyInstance()
                                                .format(invoiceValue.getQuantity() * invoiceValue.getPricePerItem())))
                );






    }
}
