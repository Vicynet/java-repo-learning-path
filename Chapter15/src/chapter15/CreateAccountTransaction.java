package chapter15;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateAccountTransaction {
    private static ObjectOutputStream transOutput;
    private static ObjectOutputStream accountOutput;

    public static void main(String[] args) {
        openFile();
        addAccountRecords();
        addTransactionRecords();
        closeFile();

        int _catDog$3 = 1;
    }

    public static void openFile() {
        try {
            accountOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("main_accounts.fbn")));
            transOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("transaction_accounts.fbn")));
        }
        catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    public static void addAccountRecords() {
        Scanner inputAccountRecord = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator (Ctrl-z) to end input.");

        while (inputAccountRecord.hasNext()) {
            try {
                Account accountRecord = new Account(inputAccountRecord.nextInt(),
                        inputAccountRecord.next(), inputAccountRecord.next(),
                        inputAccountRecord.nextDouble());
                accountOutput.writeObject(accountRecord);
            }
            catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                inputAccountRecord.nextLine(); // discard input so user can try again
            }
            catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            System.out.print("? ");
        }
    }

    public static void addTransactionRecords() {
        Scanner inputTransactionRecord = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ",
                "Enter account number and amount",
                "Enter end-of-file indicator (Ctrl-z) to end input.");

        while (inputTransactionRecord.hasNext()) {
            try {
                TransactionRecord transactionRecord = new TransactionRecord(inputTransactionRecord.nextInt(), inputTransactionRecord.nextDouble());
                transOutput.writeObject(transactionRecord);
            }
            catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                inputTransactionRecord.nextLine(); // discard input so user can try again
            }
            catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            System.out.print("? ");
        }
    }

    // close file and terminate application
    public static void closeFile() {
        try {
            if (accountOutput != null) {
                accountOutput.close();
            }
            if (transOutput != null) {
                transOutput.close();
            }
        }
        catch(IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
