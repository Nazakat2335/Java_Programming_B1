package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String word="    Java is a great language    ";

        word=word.trim();//"Java is a great language"
      //  word=word.substring(0,4);  //java
        word=word.substring(0,word.indexOf(" "));
        System.out.println(word);
        System.out.println("-------------------------");
        word=word.trim().substring(0,4).toLowerCase().toUpperCase();
        System.out.println();
    }
}
