package day12_switch_statements;

import java.util.Scanner;

public class WeekSchedule {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a day of the week:");
        String dayOfWeek= input.next();
        String message="";
        switch(dayOfWeek) {
            case "Monday":
            case "Mon":
            case "MONDAY":
            case "Fri":
            case "FRIDAY":
                message = "We dont have a class";
                break;
            case "Wednesday":
            case "Thursday":
                message = "We have Java class at 7:00 pm";
            case "Saturday":
                message = "We have Java class at 9:30";
                break;
            default:
                message = "Sunday is not valid";









        }
        System.out.println(message);

    }

}
