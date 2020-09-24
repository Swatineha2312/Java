package com.company;

public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR=12;
    public final static byte PERCENT=100;

    private int principal;
    private float annualRate;
    private byte years;

    public MortgageCalculator(int principal, float annualRate, byte years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateMortgage(){
        float monthlyRate = getMonthlyRate();
        short paymentPerMonth = getPaymentPerMonth();
        double mortgage= principal
                *(monthlyRate*(Math.pow(1+monthlyRate,paymentPerMonth)))
                /(Math.pow(1+monthlyRate,paymentPerMonth)-1);
        return mortgage;
    }

    public double calculateSchedule(
            short noOfPaymentsMade){
        float monthlyRate = getMonthlyRate();
        short paymentPerMonth = getPaymentPerMonth();
        double schedule = principal
                *(Math.pow(1+monthlyRate,paymentPerMonth)-Math.pow(1+monthlyRate,noOfPaymentsMade))
                /(Math.pow(1+monthlyRate,paymentPerMonth)-1);
        return schedule;
    }

    public double[] getRemainingBalance(){
        var balances= new double[getPaymentPerMonth()];
        for(short month=1; month<=balances.length;month++)
            balances[month-1]=calculateSchedule(month);
        return balances;
    }

    private float getMonthlyRate() {
        return annualRate / PERCENT / MONTHS_IN_YEAR;
    }
    private short getPaymentPerMonth() {
        return (short) (years * MONTHS_IN_YEAR);
    }
}
