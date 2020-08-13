package com.company;

import java.awt.*;
import java.util.Scanner;
import java.text.*;

public class DataTypes {
        public static void main(String[] args) {

         /*1byte = 8 bits
        1byte=1byte
        1 short= 2bytes
        1 int= 4 bytes
        1 long= 8bytes
        1 float= 4 bytes
        1 double= 8 bytes
        1 char= 2 bytes
        1 boolean= 1byte*/


        int age=35;
        byte yearsOld=20;
        int viewsCount= 123_456_789;
        //long viewsCount= 3_123_456_789l;
        float price= 10.98f;
        char letter='A';
        String sentence="Home";
        boolean isEligible=false;
        //System.out.println(viewsCount);

        int x=1;
        int y=x;

        System.out.println(y);
        Point point1=new Point(1,1);
        Point point2=point1;
        point1.x=2;
        System.out.println(point2);

        String message="String classes";
        System.out.println(message);

        String message2="String classes"+"!!";
        System.out.println(message2);
        System.out.println(message2.endsWith("!!"));
        System.out.println(message2.endsWith("!++"));
        System.out.println(message2.startsWith("S"));
        System.out.println(message2.length());
        System.out.println(message2.indexOf(" "));
        System.out.println(message2.replace("!!","##"));

        String message3="  KKW   ";
        System.out.println(message3);
        System.out.println(message3.trim());

        System.out.println(message2.toLowerCase());
        System.out.println(message2.toUpperCase());


        }
}
