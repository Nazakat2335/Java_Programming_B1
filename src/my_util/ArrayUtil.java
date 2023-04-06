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
}
