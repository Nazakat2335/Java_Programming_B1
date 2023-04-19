package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethods {
    public static String getList(ArrayList<String>list){

        String  finalList="LIST";
        for(String each:list){
            finalList+="\n\n"+each;



        }
        return finalList;
    }
//make a method that accept a number and prints the day of the week
public static void printDayOfWeek(int numDay) {
        ArrayList<String>dayOfWeek=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        if(numDay>=1&& numDay<=7){
            System.out.println(dayOfWeek.get(numDay-1));
        }
    System.out.println(dayOfWeek.get(numDay-1));

}
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("apple","bread","water","butter"));
        System.out.println(getList(list));

    }
}
