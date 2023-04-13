package my_util;

import java.util.Arrays;

public class ArrayUtil {

        public static int minNumInArr(int[] arr) {
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




    public static boolean containArr(int[] arr, int num) {

        for (int each : arr) {
            if (each == num) {

                return true;
            }
        }
        return false;
    }

    /**
     * This method accepts int indexOf and a number
     * And retrns the index of the number in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method accepts String array and a String
     * And retrns the index of the String in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method accepts String array and a String
     * And retrns in the a  new array with the num is added at the end
     * If it does not exist, it returns -1
     */
    public static int[] add(int[] arr, int num) {

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;

        return newArr;


    }

    /**
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */

    public static int[] addElemBeginning(int num, int... arr) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        newArr[0] = num;

        return newArr;
    }


    /**
     * This method accepts String number and the String array
     * And returns the new array with the String added at the beginning
     */

    public static String[] addElemBeginning(String word, String... arr) {

        String[] newArr = new String[arr.length + 1];

        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        newArr[0] = word;

        return newArr;
    }


    }


