
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

}
