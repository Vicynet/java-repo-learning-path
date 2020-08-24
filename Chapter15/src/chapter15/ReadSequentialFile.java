package chapter15;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.UnknownFormatConversionException;

// Reading a file of objects sequentially with ObjectInputStream
// and displaying each record.

public class ReadSequentialFile {
    private static ObjectInputStream input;


    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // enable user to select file to open
    public static void openFile() {
        try { // open file
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    // read record from file
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try {
            while (true) { // loop until there is an EOFException
                Account record = (Account) input.readObject();

                // display record contents
                System.out.printf("%-10d%-12s%-12s%13s%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), NumberFormat.getCurrencyInstance().format(record.getBalance()));
            }
        }
        catch (EOFException endOfFileException) {
            System.out.printf("%nNo more records");
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        }
        catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        }
        catch (UnknownFormatConversionException unknownFormatConversionException) {
            System.out.printf("Currency format not available");
        }
    }

    // close file and terminate application
    public static void closeFile() {
        try {
            if (input != null) {
                input.close();
            }
        }
        catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
