package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("today is saturday");
        System.out.println("What is class today");
        String className= input.next();
        System.out.println();
        System.out.println("What month is it");
        String month= input.next();
        System.out.println("I like"+month+"month");

        System.out.println();
        System.out.println("Enter your full name");
        String fullName= input.nextLine();
        System.out.println("Full name is"+fullName);





    }

    Scanner input=new Scanner(System.in);


}
