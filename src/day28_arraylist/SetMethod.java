package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println(nums);
        nums.set(1,-300);
        System.out.println(nums);
        nums.set(3,80000);
        System.out.println(nums);
      //  nums.set(9,70000);// this will throw RunTime exception of indexoutOfboundException

    }
}
