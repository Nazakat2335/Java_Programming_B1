package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] num={4,10,15,20,-200,500};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.binarySearch(num,4));//0
        System.out.println(Arrays.binarySearch(num,10));//1
        System.out.println(Arrays.binarySearch(num,200));//
        System.out.println(Arrays.binarySearch(num,15));//2
        System.out.println(Arrays.binarySearch(num,20));//-4//for using this method for get right answer it must be sorted firstly and after we can use this method of Array,if we did not sorted it, it gives us wrong answer
    }
}
