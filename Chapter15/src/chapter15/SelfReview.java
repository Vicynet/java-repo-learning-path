package chapter15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class SelfReview {
    public static void main(String[] args) throws IOException {
        Scanner inOldMaster = new Scanner(Paths.get("oldmast.txt"));
        Scanner inTransaction = new Scanner(Paths.get("trans.txt"));

        Formatter outNewMaster = new Formatter("newmast.txt");
        Account account = new Account();
        account.setAccount(inOldMaster.nextInt());
        account.setFirstName(inOldMaster.next());
        account.setLastName(inOldMaster.next());
        account.setBalance(inOldMaster.nextDouble());
        TransactionRecord transactionRecord = new TransactionRecord();
        transactionRecord.setAccount(inTransaction.nextInt());
        transactionRecord.setAmount(inTransaction.nextDouble());
        outNewMaster.format("%d %s %s %.2f%n",
                account.getAccount(), account.getFirstName(),
                account.getLastName(), account.getBalance());

//        ObjectInputStream inOldMaster = new ObjectInputStream(
//                Files.newInputStream(Paths.get("oldmast.ser")));
//
//        ObjectInputStream inTransaction = new ObjectInputStream(
//                Files.newOutputStream(Paths.get("trans.ser")));
//        ObjectOutputStream outNewMaster = new ObjectOutputStream(
//                Files.newOutputStream(Paths.get("newmast.ser")));
//
//        Account = (Account) inOldMaster.readObject();
//        transactionRecord = (TransactionRecord) inTransaction.readObject();
//        outNewMaster.writeObject(newAccount);
    }
}
