package day43_map;

import java.util.*;

public class AllMapObject {
    public static void main(String[] args) {
        Map<String, String> map =new HashMap<>();  //Order no guaranteed | null as key is OK
        map.put("James", "Java");
        map.put("Tom", "Cartoon");
        map.put("Bond", "Movie");
        map.put("Nadir", "Automation");
        map.put(null, "test");
        map.put("check", null);
        System.out.println(map);

        // map.put("Bond", "Theater");
        // System.out.println(map);


        System.out.println();
        Map <String, String> linked = new LinkedHashMap<>(); // Maintains the Insertion Order | null as key is OK
        linked.put("James", "Java");
        linked.put("Tom", "Cartoon");
        linked.put("Bond", "Movie");
        linked.put("Nadir", "Automation");
        linked.put(null, "test");
        linked.put("check", null);
        System.out.println(linked);


        System.out.println();       // Maintains the SORTER (Ascending) ORDER | null as key is NOT OK
        Map <String, String> treeMap = new TreeMap<>();
        treeMap.put("James", "Java");
        treeMap.put("Tom", "Cartoon");
        treeMap.put("Bond", "Movie");
        treeMap.put("Nadir", "Automation");
        // treeMap.put(null, "test");
        treeMap.put("check", null);
        System.out.println(treeMap);


        System.out.println();
        Map <String, String> tableMap = new Hashtable<>(); // Order is NOT guaranteed | null as key or as value is NOT OK
        tableMap.put("James", "Java");
        tableMap.put("Tom", "Cartoon");
        tableMap.put("Bond", "Movie");
        tableMap.put("Nadir", "Automation");
        // treeMap.put(null, "test");
        // tableMap.put("check", null);
        System.out.println(tableMap);



    }
}
