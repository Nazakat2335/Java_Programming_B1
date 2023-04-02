package day20_nested_loops;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str="AABCCDEEF";//INDEX 0123456789;

for(int i=0;i<str.length();i++){
    char outerLetter=str.charAt(i);  //A
                                     //A
                                     //A
                                     //B
                                     //C
                                     //C......

    int count=0;
    for(int j=0;j<str.length();i++){
        char innerLetter=str.charAt(j);
        if(outerLetter==innerLetter){
            count++;

        }
    }


        }

    }
}
