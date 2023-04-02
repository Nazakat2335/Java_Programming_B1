package day12_switch_statements;

import java.util.Scanner;

public class MaleOrFemale {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
         char letter='h';
         switch(letter){
             case 'm':
             case'M' :

                 System.out.println("Male Restroom");
                 break;
             case'f' :

             case'F' :
                 System.out.println("Female Restroom");
                 break;
             default:
                 System.out.println("Invalid letter");



        }
    }
}
