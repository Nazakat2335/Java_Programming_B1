package day12_switch_statements;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price and calories");
        double price = 0.0;
        double calories = 0;
        System.out.println("which size drink they want");
        String size = input.next();
        boolean isSize = true;
        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 1.50;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We dont have this size");
                isSize = false;


        }
        if (isSize) {
            System.out.println("your order for" + size + "cofee" + price + "and calories" + calories);
        }
    }
}