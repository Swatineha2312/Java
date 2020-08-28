package com.company;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main { 
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner=new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between"+" "+min+ " "+ "and"+" "+ max);
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualRate, byte years ){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        short paymentPerMonth = (short)(years * MONTHS_IN_YEAR);
        double mortgage= principal
                *(monthlyRate*(Math.pow(1+monthlyRate,paymentPerMonth)))
                /(Math.pow(1+monthlyRate,paymentPerMonth)-1);
        return mortgage;
    }
    public static void main(String[] args) {
        int principal=(int)readNumber("Principal: ",1000,1000_000);
        float annualRate=(float)readNumber("Annual Interest Rate: ",1,30);
        byte years=(byte)readNumber("Period(years):",1,10);

        double mortgage=calculateMortgage(principal,annualRate,years);
        String formattedMortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+formattedMortgage);
    }
}
