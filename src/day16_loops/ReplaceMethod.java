package day16_loops;

public class ReplaceMethod {
    public static void main(String[] args) {


        String str = "java language";
        System.out.println(str);

        str = str.replace('a', 'u');  //juvu lunguuge
        System.out.println(str);

        System.out.println(str.replace('u', 'o'));
        System.out.println(str);


        String str2 = "Today is Thursday. Thursday is good";
        str2 = str2.replace("Thursday", "Saturday");  // Today is Saturday. Saturday is good
        System.out.println(str2);

        str2 = str2.replaceFirst("Saturday", "Monday"); //changed only first
        System.out.println(str2);
        //18.a - .replace(char1, char2);        -it will take the given char1 and and replace all of them with char2 in a String
        //        18.b - .replace(Str1, Str2);        -it will take the given Str1 and and replace all of them with Str2 in a String
        //
        //
        //        19. - .replaceFirst(Str1, Str2);    -it will take the given Str1 and and replace first occurrence of Str1 with Str2 in a String



    }
}
