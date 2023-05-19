package day41_collection;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
import java.util.*;
public class SetObjects {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add(null);
        set.add("hello");//not allow duplicate
        set.add("400");//allow nul
                           //not allow index
        set.add("$5.0");
        set.add("hello");
        set.add("%");
        System.out.println(set);
        System.out.println("=========================");

        Set<String>set1=new LinkedHashSet<>();
        set1.add(null);
        set1.add("hello");//allow nul,dont allow duplicate
        set1.add("400");
        set1.add("$5.0");
        set1.add("hello");
        set1.add("%");
        System.out.println(set1);
        
        System.out.println("=================");

        Set<String>set2=new TreeSet<>();
      //  set1.add(null); DOES NOT  ALLOW THE  NULL
        set2.add("hello");
        set2.add("400");//dont allow duplicate
        set2.add("$5.0");
        set2.add("hello");//DUPLICATION IS NOT ALLOW ELSE
        set2.add("%");
        set2.add("WORLD");
        System.out.println(set2);
        System.out.println("==================");
        Set<Integer>set4=new TreeSet<>();
        set4.add(5);
        set4.add(1);
        set4.add(-2);
        set4.add(8);
        set4.add(50);
        System.out.println(set4);  //sorted automated 
    }
}
