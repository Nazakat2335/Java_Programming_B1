package day24_methods;

public class Age {
    ///*
    //    make a method that accepts a number / year
    //    and calculates how old you are
    // */

    public static void calculateAge(int bornYear){
        int currentYear=2023;
        int yourAge=currentYear-bornYear;
        System.out.println("You are"+yourAge+"old!");


        String name="Nigar";
        int index=name.indexOf('N');
        String part=name.substring(1,4);
        String part2=name.substring(2);
        calculateAge(1968);


    }



        public static void calculateAge (int bornYear, int currentYear){
            //int currentYear = 2023;
            int yourAge = currentYear - bornYear;
            System.out.println("You are "+yourAge+" old!");
        }

        public static void main(String[] args) {

        calculateAge(1960,2023);
        }
    }

