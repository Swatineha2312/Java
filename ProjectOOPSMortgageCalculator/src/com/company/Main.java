package com.company;

public class Main{

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000_000);
        float annualRate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period(years):", 1, 10);

        var calculator=new MortgageCalculator(principal,annualRate,years);
        var report=new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}