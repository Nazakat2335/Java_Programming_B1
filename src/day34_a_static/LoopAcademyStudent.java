package day34_a_static;

import java.util.Arrays;

public class LoopAcademyStudent {
    String name;
    int groupNum;


    static int batchNum;
    static String[] instructors;
    static String schoolName;


    public LoopAcademyStudent(String name, int groupNum) {

        this.name = name;
        this.groupNum = groupNum;

    }

    static {


        batchNum = 1;
        instructors = new String[]{"Nadir","Feyruz","Gina","James","Diana"};
        schoolName="Loop Academy";
        printInfo();


    }

    public static void printInfo(){

//        System.out.println("School Name"+schoolName);
//        System.out.println("batch number"+batchNum);
//        System.out.println("instructors"+ Arrays.toString(instructors));
    }
}