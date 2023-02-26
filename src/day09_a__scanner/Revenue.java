package day09_a__scanner;


import java.util.Scanner;

public class Revenue {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        double price;
        int quantity;

        System.out.println("Enter the price and quantity");
        price=input.nextDouble();//Java ask user to input/info/value then assign that value to price variable
        quantity=input.nextInt();
double revenue=price*quantity;
        System.out.println("Our  revenue "+revenue );

//        double price=10.99;
//        int quantity=5;
//        System.out.println("Enter the price and quantity");
//        System.out.println(price);
//        System.out.println(quantity);







    }

}
