package day09_a__scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter tree angle number");
        double degreeOne= input.nextDouble(),
        degreeTwo=input.nextDouble(),
                degreeThree= input.nextDouble();
        double total=degreeThree+degreeOne+degreeTwo;
        System.out.println("It is triangle "+(total==180));
        System.out.println("It is circle "+ (total==360));
        System.out.println("Is either triangle or circle "+(total==180 ||total==360));














    }
}
