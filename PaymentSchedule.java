package com.company;

import java.util.Scanner;
import java.text.NumberFormat;

public class PaymentSchedule{
    final static byte MONTHS_IN_YEAR=12;
    final static byte PERCENT=100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1000_000);
        float annualRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period(years):", 1, 10);

        printMortgage(principal, annualRate, years);
        printPaymentSchedule(principal, annualRate, years);
    }

    private static void printMortgage(int principal, float annualRate, byte years) {
        double mortgage = calculateMortgage(principal, annualRate, years);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("----------");
        System.out.println("Monthly payments:" + formattedMortgage);
    }

    private static void printPaymentSchedule(int principal, float annualRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------");
        for(short month=1; month<=years*MONTHS_IN_YEAR;month++){
            double schedule = calculateSchedule(principal, annualRate, years,month);
            String formattedSchedule = NumberFormat.getCurrencyInstance().format(schedule);
            System.out.println(formattedSchedule);
        }
    }

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
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        short paymentPerMonth = (short)(years * MONTHS_IN_YEAR);
        double mortgage= principal
                *(monthlyRate*(Math.pow(1+monthlyRate,paymentPerMonth)))
                /(Math.pow(1+monthlyRate,paymentPerMonth)-1);
        return mortgage;
    }
    public static double calculateSchedule(int principal, float annualRate, byte years,
                                           short noOfPaymentsMade){
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        short paymentPerMonth = (short)(years * MONTHS_IN_YEAR);
        double schedule = principal
                *(Math.pow(1+monthlyRate,paymentPerMonth)-Math.pow(1+monthlyRate,noOfPaymentsMade))
                /(Math.pow(1+monthlyRate,paymentPerMonth)-1);
        return schedule;
    }

    }

