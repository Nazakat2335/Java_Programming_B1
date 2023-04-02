package day17_loops;

import java.util.Scanner;

public class MinAndMax {


    /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */

    /*
        repeated steps:

            ask for a number

            check is it the biggest

            check is it the smallest


     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      // int max=0;
        //int min=9999999;
       // int max=Integer.MAX_VALUE;
        //int min=Integer.MIN_VALUE;
        int max=-272;
        int min=273;
        System.out.println(max);
        System.out.println(min);
        int count=1;
        while(count<5) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (max < number) {

                max = number;
            }
            if (min > number) {
                min = number;
            }
            count++;
        }
        System.out.println("Max number:"+max);
        System.out.println("Min number:"+min);







    }






    }


