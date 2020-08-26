package com.company;

public class Loops{
    public static void main(String[] args) {
	//for loop--> understood
        //while loop--> when we dont know how many times user will enter data
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(!input.equals("quit")){
            System.out.print("Enter the input:");
            input=scanner.next().toLowerCase();
            System.out.println(input);
        }
        //do while loop--> executed at least once; rarely used
        Scanner scanner=new Scanner(System.in);
        String input="";
        do{
            System.out.print("Enter the input:");
            input=scanner.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));

        //break&continue
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(true){
            System.out.print("Enter the input:");
            input=scanner.next().toLowerCase();
            if(input.equals("pass")){
                continue;      //this will start the loop from initial point
            }
            if(input.equals("quit")){
                break;  //this will avoid printing quit
            }
            System.out.println(input);
        }*/

        // for each loop
        String[] fruits={"apple","mango","orange"};
        //quoting e.g. of for loop to show difference
        for (int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        //for each
        for (String fruit:fruits){
            System.out.println(fruit);
        }
}
}