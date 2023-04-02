package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        //with normal way
        String city1="Fairfax";
        String city2="New York";
        String city3="Alexandra";
        String city4="Bethesda";
        String city5="Baku";
        String city6="Antalya";
        //String []cities2={city1, city2, city3,city4}
        String[] cities={"Fairfax","New York","Alexandra","Bethesda","Baku","Antalya"};
        //HOW I CAN REACH EACH ELEMENT?
        System.out.println(cities[0]);//String word="java";
                                                     //0123;
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
         //HOW I CAN PRINT ALL ELEMENTS IN ARRAY?
        System.out.println("All cities:"+cities[0]+","+cities[1]+","+cities[2]+","+cities[3]+cities[4]+","+cities[5]+"....");

        //System.out.println(cities);This is NOT WAY HOW TO PRINT ALL THE ELEMENTS IN ARRAY.THIS SHOW SOME KI
        //Arrays.toString(parameter);

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));

        String allCities = Arrays.toString(cities);
        System.out.println(allCities);
        System.out.println(Arrays.toString(cities).substring(1, Arrays.toString(cities).length()-1));

        System.out.println("------------------------------------------------");
        //HOW TO WE GET THE NUMBER OF ELEMENTS IN ARRAY
        System.out.println(cities.length);//6
        System.out.println(Arrays.toString(cities).length());//55


    }
}
