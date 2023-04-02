package day16_loops;

public class IndexOf {
    public static void main(String[] args){

        String str="banana";// length()>>>6
        //String fistChar=str.charAt();
        String firstChar=""+str.charAt(0);//change string to char using""
        System.out.println(firstChar);
        firstChar=str.substring(0,1);// reassigned
        // get last character of the word
        String lastChar=""+str.substring(str.length()-1);//
        System.out.printf(lastChar);
        // how can i get the last index of "n"
        System.out.println(str.lastIndexOf("n"));//4





    }
}
