package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        //Mortgage Calculator Project
        byte MONTHS_IN_YEAR=12;
        byte PERCENT=100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal:");
        int principal= scanner.nextInt();

        System.out.print("Annual Rate:");
        float annualRate= scanner.nextFloat();
        float monthlyRate=annualRate/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period(Years):");
        byte years= scanner.nextByte();
        int paymentPerMonth= years*MONTHS_IN_YEAR;

        double mortgage= principal*(monthlyRate*(Math.pow(1+monthlyRate,paymentPerMonth))) /
                (Math.pow(1+monthlyRate,paymentPerMonth)-1);

        String formattedMortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+formattedMortgage);
    }
}
