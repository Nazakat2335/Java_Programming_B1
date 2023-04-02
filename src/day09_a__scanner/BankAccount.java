package day09_a__scanner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("account balance");
        double balance1= input.nextDouble();
        System.out.println("how much you want to withdraw ");
        double balance2= input.nextDouble();
        System.out.println("Check the balance after the withdrawal");

         double balance3=balance1-balance2;

         if(balance3<0){
             System.out.println("fee to the balance:-"+balance3);

         }




        /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */

    }
}
