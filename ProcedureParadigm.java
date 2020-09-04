package com.company;

public class ProcedureParadigm{
    public static void main(String[] args) {
      int salary=50000;
      int extraHours=10;
      int hourlyRate=20;

      System.out.println( calculateWage(salary,extraHours,hourlyRate));
    }
    public static int calculateWage(int salary, int extraHours, int hourlyRate){
        int wage= salary+(extraHours*hourlyRate);
        return wage;
    }

}