package chapter17;

import java.text.NumberFormat;

public class Invoice {
    private final int partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {

        // validate quantity
        if (quantity < 0)  {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }

        // validate pricePerItem
        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // validate quantity
        if (quantity < 0)  {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        // validate pricePerItem
        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%-13d%-18s%-10d%-8s%n", getPartNumber(),  getPartDescription(),
                getQuantity(), NumberFormat.getCurrencyInstance().format(getPricePerItem()));
    }

    // method required to carry out contract with interface Payable

    public double getPaymentAmount()
    {
        return getQuantity() * getPricePerItem(); // calculate total cost
    }
}
