package day15_string;

public class IndexOfmethod {


    public static void main(String[] args){
        String str = "loop";
        //            0123

        System.out.println(str.indexOf("l"));   // 0
        System.out.println(str.indexOf("o"));   // 1

        System.out.println(str.indexOf('l'));

        System.out.println(str.indexOf("op"));


        System.out.println(str.indexOf("oo"));


        String str1="looooooop";
        //           012345678
        System.out.println(str.indexOf("o"));  //1
        System.out.println(str.indexOf("o", 2)); //3

        System.out.println(str.indexOf("o", str.indexOf("o")+1));
        //                                                     1 + 1 = 2
        //                                 "o",  2







    }
}
