package day25_methods;

public class FixFormat {
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

    /**
     * This method made by Loopcamp Batch#1
     * This method accepts a String parameter and puts it in a format
     * Ex:
     *      The format will be like this
     *
     *      First letter is in upper case and rest is in lower case
     *
     * Then return a String in a formatted way.
     */
    public static String fixFormat (String str) { // __feyruz__  -- F
        String fixed = str.trim();
        fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return fixed;
    }


    /**
     This method will accept a String with multiple words
     And convert it to cameCase String
     Input:
     JAVA will ruLE tHe wORLd
     Output:
     java Will Rule The World
     */
    public static String camelCase (String str){   //"JAVA will ruLE tHe wORLd"
        // JavaWillRuleTheWorld
        String [] arr = str.split(" ");
        String result = "";
        for (String each : arr) {
            result += (each.charAt(0)+"").toUpperCase() + each.substring(1).toLowerCase();
        }
        // JavaWillRuleTheWorld
        return (result.charAt(0)+"").toLowerCase() + result.substring(1);

    }


}


