package my_util;

public class StringUtil {
    /**
     This method made by Loopcamp Batch#1
     The method accepts a String and returns the reversed String
     */
    public static String reverseStr (String str) {

        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {

        StringUtil.reverseStr("loopcamp");
        System.out.println(StringUtil.reverseStr("Hello World!"));

    }
    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == letter) {
                ++count;
            }
        }
        return count;
    }
    }

