package day43_map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
     /*
        make a method that accepts a String, and returns a Map and stores that character as key and count each characters as a value.
        Ex:     apple
            a - 1
            p - 2
            l - 1
            e - 1
     */

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("apple"));
    }

    public static Map<String, Integer> frequencyOfChar(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String key = str.charAt(i) + "";
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);


            } else {
                //if the character is not already among
                map.put(key, 1);

            }
        }
return map;

    }
}





