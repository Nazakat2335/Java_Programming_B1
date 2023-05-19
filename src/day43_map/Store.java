package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        Map<String,Double>map=new HashMap<>();
        map.put("Water",1.5);
        map.put("Coffee",7.5);
        map.put("Apple",5.5);
        map.put("Bread",4.5);
        map.put("Cucumber",2.5);


        // can you print the inventory
        /*
            Store Inventory
                Item: Water for $1.5
                .
                .
                .
         */

        for(Map.Entry<String,Double>eachRow:map.entrySet()){
            System.out.println("\t"+eachRow.getKey()+"for $"+eachRow.getValue());

            System.out.println();

            //Can u print all the value?
            System.out.println("value"+map.values());
        }



    }
}
