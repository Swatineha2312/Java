package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageConditions {
    public static void main(String[] args) {
        //Mortgage Calculator Project
        byte MONTHS_IN_YEAR=12;
        byte PERCENT=100;
        Scanner scanner = new Scanner(System.in);
        int principal=0;
        float annualRate=0;
        float monthlyRate=0;
        int paymentPerMonth=0;

        while (true) {
            System.out.print("Principal ($1K-$1M):");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
        while (true) {
            System.out.print("Annual Rate:");
            annualRate = scanner.nextFloat();
            if (annualRate >= 1 && annualRate <= 30) {
                monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        while (true) {
            System.out.print("Period(Years):");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                paymentPerMonth = years * MONTHS_IN_YEAR;
                break;
            }System.out.println("Enter a value between 1 and 30");
        }
            double mortgage= principal*(monthlyRate*(Math.pow(1+monthlyRate,paymentPerMonth))) /
                    (Math.pow(1+monthlyRate,paymentPerMonth)-1);
            String formattedMortgage=NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage:"+formattedMortgage);
    }
}
