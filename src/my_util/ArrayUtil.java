package my_util;

import java.util.Arrays;

public class ArrayUtil {
    public class ArrayUtill {
        public static int minNumInArr (int[]arr){
            Arrays.sort(arr);
            return arr[0];

        }
        public static int minNumInArr2(int... number) {
            int small = number[0];
            for (int i = 0; i < number.length; i++) {

                if (small > number[i]) {
                    small = number[i];
                }
            }
            return small;
        }


    }
    public static boolean containArr (int [] arr, int num) {

        for (int each : arr) {
            if(each == num) {

                return true;
            }
        }
        return false;
    }
    /**
     *
     * This method accepts int indexOf and a number
     * And retrns the index of the number in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * This method accepts String array and a String
     * And retrns the index of the String in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (String [] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
    /**
     *
     * This method accepts String array and a String
     * And retrns in the a  new array with the num is added at the end
     * If it does not exist, it returns -1
     */
    public static int [] add (int [] arr, int num) {

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;

        return newArr;


    }}
