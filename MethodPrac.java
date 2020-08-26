package com.company;

public class MethodPrac{
    public static void main(String[] args) {
        //Creating Methods
        String message= greetClient("Swati","Puri");
        System.out.println(message);
        //greetClient("Neha");
    }
    /*public static void greetClient(String firstName, String lastName){
        System.out.println("Hi "+firstName+ " "+lastName);
    }*/
    public static String greetClient(String firstName, String lastName){
        return "Hi "+firstName+ " "+lastName;
    }
}
