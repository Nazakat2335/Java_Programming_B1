package day11_if_statements;

import java.util.Scanner;

public class loginApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 4 digit pin code");
        int userPincode= input.nextInt();
        System.out.println("write last 4 SSn digits:");
        int userSnn$Digits=input.nextInt();
        



        int expectedPincode = 1234;
        int expected4SnnDigit = 4321;


        if (userPincode == expectedPincode && userSnn$Digits == expected4SnnDigit) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Authentication failed!");

            if (userPincode != expectedPincode) {
                System.out.println("You have entered invalid pin code");
            }

            if (userSnn$Digits != expected4SnnDigit) {
                System.out.println("You have entered invalid SNN 4 digits");
            }

        }



    }
}
