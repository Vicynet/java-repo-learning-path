package chapter15;

import java.io.Serializable;

public class TransactionRecord implements Serializable {
    private int account;
    private double amount;

    public TransactionRecord(){};

    public TransactionRecord(int account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
