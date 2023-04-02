package day16_loops;
/* if the number of characters are even print the middle two
f the number of characters are odd print the middle two
 */
public class MiddleChar {
    public static void main(String[] args) {
        String word="California";//0123456789
        boolean isEven=word.length()%2==0;
        if(isEven){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));//  ornia we want (5-1)=4 (devide 2)  /2=4+1=5


        }else{
            //"Californi"//9 characters
            System.out.println(word.substring(word.length()/2,word.length()/2+1));//9/2=4(remainder)
            System.out.println(word.charAt(word.length()/2));// this is also fine if it is single character

            word="califaornia";
            System.out.println("k");// output will be-1
            System.out.println(word.indexOf("hello"));//6
            System.out.println(word.indexOf("quiz"));//1 if i want to get  ia   i using substring(length(-2)
        }

    }
}
