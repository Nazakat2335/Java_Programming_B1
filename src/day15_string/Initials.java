package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        //har firstChar = first.charAt(0);

        String initials = "" + first.charAt(0) + last.charAt(0);
        //String initials = ("" + first.charAt(0) + last.charAt(0)).toUpperCase();
        //initials = initials.toUpperCase();
        System.out.println("Your initial is: " + initials);
        System.out.println("Your initial is: " + initials.toUpperCase());


    }
}
