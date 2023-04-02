package day12_switch_statements;

import java.util.Scanner;

public class WendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg = "";


        System.out.println("Welcome to the wending machine");
        System.out.println("Please,select one of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();
        switch (selection) {
            case "Drinks":
                System.out.println("\nYou chose drinks)click 1,2,3):\n\t1) Water\n\t2) Soda\n\t3) Juice");
                int drinkNumber = input.nextInt();
                if (drinkNumber == 1) {
                    msg = "You have selection water";
                } else if (drinkNumber == 2) {
                    ;
                    msg = "You have selection soda";
                } else {
                    msg = "Invalid input";


                }
                break;
            case "Snacks":
                System.out.println("\nYou chose drinks)click 1,2,3):\n\t1) Water\n\t2) Soda\n\t3) Juice");
                int snackNUmber = input.nextInt();
                if (snackNUmber == 1) {
                    msg = "You have selection water";
                } else if (snackNUmber == 2) {
                    ;
                    msg = "You have selection soda";


                }
        }
    }
}
