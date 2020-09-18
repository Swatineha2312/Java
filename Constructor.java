Employee.java

package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    //public int extraHours;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours){
        return(baseSalary+(getHourlyRate() *extraHours));
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
            this.baseSalary=baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate cannot be o or negative");
        this.hourlyRate = hourlyRate;
    }
}

Main.java

package com.company;

public class Constructor{
    public static void main(String[] args) {
        var employee= new Employee(50000,30);
        //employee.setBaseSalary(50000);
        //employee.setHourlyRate(30);
       // employee.extraHours=10;
        int wage=employee.calculateWage(10);
        System.out.println(wage);
        }
}

