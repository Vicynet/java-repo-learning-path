package com.techcrea8;

import java.math.BigDecimal;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1= new SavingsAccount(BigDecimal.valueOf(2000));
        SavingsAccount saver2= new SavingsAccount(BigDecimal.valueOf(3000));

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

        saver1.modifyInterestRate(BigDecimal.valueOf(0.04));

//        saver1.setSavingsBalance(BigDecimal.valueOf(2000));
        System.out.println(saver1.getAnnualInterestRate());
        System.out.println(saver2.getAnnualInterestRate());
                saver1.setSavingsBalance(BigDecimal.valueOf(2000));

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

//        for (int year = 1; year <= 12; year++) {
//            BigDecimal oneYearSavingsRate = saver1.getSavingsBalance().multiply(saver1.getAnnualInterestRate().add(BigDecimal.ONE).pow(year));
//            System.out.printf("%4d%20.2f%n", year, oneYearSavingsRate);
//        }






    }
}
