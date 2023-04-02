package day18_loops;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String word = "abcaabc";
        String unique = "";
        for (int i = 0; i < word.length() ; i++) {

            if (!unique.contains("" + word.charAt(i))){  // 'a' -- > ("" + 'a') ---- ? "a"
                unique += word.charAt(i);
            }


        }

        System.out.println(unique);


    }
}