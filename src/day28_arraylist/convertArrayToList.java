package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer>num;
        Integer[] arr={1,2,3};//The reason we made this with Integer daratype is because we will use array as part o Arraylist and
        System.out.println(Arrays.toString(arr));//Array
        Arrays.asList(arr);//convert Array to ArrayList
        num=new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,7,8));//ArrayList
        System.out.println(num);
        //here create Array list with initial value directly
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList());//
        System.out.println(list2);

    }
}
