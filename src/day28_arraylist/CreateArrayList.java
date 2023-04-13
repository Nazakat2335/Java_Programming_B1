package day28_arraylist;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {


        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Tom");//adding element to Arraylist
        listOne.add("Jerry");
        System.out.println(listOne);

//we can copy one arrayList to another one
        ArrayList<String>listTwo=new ArrayList<>(listOne);//here we create a new Arraylist
        System.out.println(listTwo);
        listTwo=listOne;//we just refering to the same one as listOne;dont create a new

    }
}
