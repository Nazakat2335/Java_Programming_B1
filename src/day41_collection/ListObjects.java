package day41_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class ListObjects {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        list2.add("a");//index0
        list2.add("b");//index1
        list2.add("c");//index2
        list2.add("d");//3
        list2.add(null);//4
        list2.add("a");//5 Arraylist allow duplicate

        System.out.println(list2);
        System.out.println(list2.get(2));
        System.out.println("====================");

        List<String>list3=new LinkedList<>();
        list3.add("a");//index0
        list3.add("b");//index1
        list3.add("c");//index2
        list3.add("d");//3
        list3.add(null);//4
        list3.add("a");//5 Arraylist allow duplicate
        System.out.println(list3);
        System.out.println(list3.get(3));
        System.out.println("========================");

        List<String>list4=new Vector<>();
        list4.add("a");//index0
        list4.add("b");//index1
        list4.add("c");//index2
        list4.add("d");//3
        list4.add(null);//4
        list4.add("a");//5
        System.out.println(list4);
        System.out.println(list4.get(3));




    }
}
