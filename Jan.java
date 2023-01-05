
package com.code.jan;
import java.util.*;
public class Jan{



    public boolean wordPattern(String pattern, String s){

        String[] words = s.split(" ");

        if(pattern.length() != words.length)
            return false;

        Map<Character,String>charToWord = new HashMap<>();
        Map<String,Character>wordToChar = new HashMap<>();


        for(int index = 0; index < pattern.length(); index++){

            char c = pattern.charAt(index);
            String word = words[index];

            if(!charToWord.containsKey(c)){

                charToWord.put(c,word);
            }

            if(!wordToChar.containsKey(word)){

                wordToChar.put(word,c);
            }

            if(!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c))
                return false;

        }
        return true;
    }

    public boolean detectCapitalUse(String string){

        if(string.length()==0 || string.length()==1)return false;

        if(Character.isUpperCase(string.charAt(0))){

            boolean firstUpperChar = Character.isUpperCase(string.charAt(1));

            for(int index = 2; index < string.length(); index++){

                boolean secondUpperChar = Character.isUpperCase(string.charAt(index));

                if(firstUpperChar !=secondUpperChar)return false;
            }
        }
        else{
            
            for(int index = 0; index < string.length(); index++){

                if(Character.isUpperCase(string.charAt(index)))return false;
            }
        }
        return true;

    }



}
