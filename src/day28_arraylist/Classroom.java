package day28_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String>group=new ArrayList<>();
        System.out.println(group);
        group.add("Tom");
        group.add("Jerry");
        group.add("Mouse");
        group.add("Mickey");
        System.out.println(group);
        group.add("Vinni");
        System.out.println(group);
        //get the total element count
        System.out.println(group.size());
        System.out.println("Fist cartoon character:"+group.get(0));
        System.out.println("Last cartoon character"+group.get(group.size()-1));
        for (int i = 0; i<group.size(); i++) {
            System.out.println("cartoon character number"+(i+1)+": "+group.get(i));


        }


    }
}
