package day09_a__scanner;

import java.util.Scanner;

     public class CkeckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are hungry,true or false");
        boolean isHungry = input.hasNextBoolean();


        if (isHungry==false) {
            System.out.println("You are hungry, so I will get some food for you");


        } else {
            System.out.println("print: Great, then practice java");
        }
    }


}