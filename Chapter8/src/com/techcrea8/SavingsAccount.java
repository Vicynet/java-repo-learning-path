package com.techcrea8;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class SavingsAccount {
//    (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
//    to store the annual interest rate for all account holders. Each object of the class contains a
//    private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//    Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
//    savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
//    Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
//    value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
//    saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
//    to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
//    both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
//    the new balances for both savers.
    private static BigDecimal annualInterestRate = BigDecimal.valueOf(0.09);
    private BigDecimal savingsBalance;

//    public SavingsAccount() {
//    }
    public SavingsAccount(BigDecimal savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void setSavingsBalance(BigDecimal savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public BigDecimal getSavingsBalance() {
        return savingsBalance;
    }

    public static BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    public PrintStream calculateMonthlyInterest () {
//    public BigDecimal calculateMonthlyInterest () {
        //When using divide you should use a MathContext, in case the exact result has an infinite number
        //of decimal
//        PrintStream newBalanceFor12Months = null;
        PrintStream newBalance = null;
//        BigDecimal monthlyInterest = getSavingsBalance().multiply(annualInterestRate).divide(BigDecimal.valueOf(12), RoundingMode.HALF_UP);
        for (int year = 1; year <= 12; year++) {
            BigDecimal oneYearSavingsRate = getSavingsBalance().multiply(getAnnualInterestRate().add(BigDecimal.ONE).pow(year));
            newBalance = System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(oneYearSavingsRate));
//            newBalanceFor12Months = System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(oneYearSavingsRate));

        }
//
        return  newBalance;
//        return NumberFormat.getCurrencyInstance().format(getSavingsBalance().add(monthlyInterest));

    }

    public static void modifyInterestRate (BigDecimal annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

}
