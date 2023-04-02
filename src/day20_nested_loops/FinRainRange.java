package day20_nested_loops;

import java.util.Scanner;

public class FinRainRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num= input.nextInt();

        int count=0;
        for(int i=0;i<num;i++){
            count=1;
            if (num%3==0&&num%5==0){
                System.out.println("This is finRa");
            }

            if(num%3==0){
                System.out.println("this is fin");
                if(num%5==0){
                    System.out.println("This is ra");

                    }else{
                    System.out.println("This is not FinRA");
                    }

                }
            }

    }
}
