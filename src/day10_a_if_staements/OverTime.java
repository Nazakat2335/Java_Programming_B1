package day10_a_if_staements;

import java.util.Scanner;

public class OverTime {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        double hourlyRate = 100.0;
        double workedHours = 30;   // workedHours = 45;
        double netPay;



        double extraHours = workedHours - 40;
        netPay = 0;


        if (workedHours > 40) {

            // I have worked more than 40 hours
            //netPay = netPay +  extraHours * (hourlyRate * 1.5);
            netPay +=  extraHours * (hourlyRate * 1.5);
            System.out.println("You worked " + workedHours + " hours at the rate of " + hourlyRate + ", but with " + extraHours + " extra hours overtime. So, you get in total pay of $" + netPay );

        } else {
            netPay = workedHours * hourlyRate;
            System.out.println("You worked " + workedHours + " hours at the rate of " + hourlyRate + "So, you get in total pay of $" + netPay );

        }



    }

}
