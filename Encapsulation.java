Employee.java

package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    //public int extraHours;

    public int calculateWage(int extraHours){
        return(baseSalary+(getHourlyRate() *extraHours));
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
            this.baseSalary=baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate cannot be o or negative");
        this.hourlyRate = hourlyRate;
    }
}

Main.java

package com.company;

public class Encapsulation{
    public static void main(String[] args) {
        var employee= new Employee();
        employee.setBaseSalary(50000);
        employee.setHourlyRate(30);
       // employee.extraHours=10;
        int wage=employee.calculateWage(10);
        System.out.println(wage);
        }
}
