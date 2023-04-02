package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= input.nextInt();//4
        int numOfSum=0;
        while(number>=0){

            numOfSum+=number;//numberOfSum=number+numberOfSum
            System.out.println("Sum of number so far:"+numOfSum);
            System.out.println("Enter number again:");
            number= input.nextInt();
            if(number<0){
                System.out.println(number+"is negative number.That is why  the while loop ended.");
            }


        }



    }
}