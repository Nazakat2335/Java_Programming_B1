package day18_loops;

public class Palindrom {
    public static void main(String[] args) {
        String word="abcba";
        String revers="";
        for(int i=word.length()-1; i>=0; i--){
        revers+=word.charAt(i);

    }
        if(word.equals(revers)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("This is not palindrome");
            //ternary :word.equal(reverse) ? palindrome:palindrome
        }
        }
   /*
    Palindrome: its the same reading from the beginning and end

    Ex:
    mom
            racecar
    anna
            madam

    Task: Check if a word is palindrome

    Flow:
    declare some initial String
    how to reverse a String
    check if the reverse version is the same as the original
     */
}
