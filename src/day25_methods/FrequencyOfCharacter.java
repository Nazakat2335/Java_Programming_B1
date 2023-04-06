package day25_methods;

import my_util.StringUtil;

public class FrequencyOfCharacter {
    public static int frequencyOfCharacter (String str, char ch){
        //"aabbaacca", 'a'
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }


    public static class UniqueCharacters {




            }

        }
