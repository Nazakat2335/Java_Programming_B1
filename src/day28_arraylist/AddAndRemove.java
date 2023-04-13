package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Computer");
        list.add("Mouse");
        list.add("Keyword");
        list.add("Game");
        list.add("Screen");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        String removed= list.remove(0);//remove  the first element and return the removed element is string, we can assign it to a String variable
        System.out.println(list);
        boolean isRemoved=list.remove("Keyword"); //RETURN BOOLEAN
        System.out.println(isRemoved);
        System.out.println(list);

        list.add("Screen");//removed first screen
        list.add("Screen");
        list.add("Screen");
        list.add("Cable");
        list.add("Screen");

        System.out.println(list);
        list.remove("Screen");//remove first remove
        System.out.println(list);



    }
}
