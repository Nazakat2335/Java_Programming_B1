package day14_string;

public class RecapMethods {
    public static void main(String[] args){


        String str="Loop";
        String str2=new String ("Loop");
        System.out.println("Compare with =="+(str==str2));//false
        System.out.println("Compare with .equals()"+str.equals(str2));

        System.out.println("Compare with =="+str.equals("Loop"));//false

        String word1="loop academy";
        System.out.println("To upper case: " + word1.toUpperCase());

        String word2="LOOP ACADEMY";
        System.out.println("To lower case: " + word2.toLowerCase());

        String s="pen";
        String s1=new String("pen");
        System.out.println("Compare with=="+(s==s1));//false
        System.out.println("Compare with equals()"+s.equals(s1));//true

        System.out.println("Compare with equals()"+s.equals("pen"));//true
        System.out.println("Compare with equals()"+s.equalsIgnoreCase("pen"));//true




    }
}
