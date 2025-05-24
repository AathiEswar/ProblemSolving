package ProblemSolving.DSAPrep;

import java.util.ArrayList;
import java.util.List;

public class WordContainsChar {
    /*
       INFERENCE :
       - Input -> Array of Strings , and a char
       - Output -> all the indices of the character that contains the char

       BRUTE FORCE :
       - if len of array is 0 return []
       - loop through array :
           - loop through each word:
               - if the word contains char :
                   - add the index to res list and break
       - return list

       TC : O( n * k ) [ n = len of array , k = len of string ]
       SC : O(1) [ resultant array does not take space ]

       INSIGHTS :
           - indexOf is more efficient than contains coz contains use indexOf internally
           - indexOf uses primitive char , contains uses String
    */
    public List<Integer> findWordsContaining(String[] words, char x) {
        int len = words.length;

        if(len == 0){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < len ; i++ ){
            String word = words[i];
            for(int j = 0 ; j < word.length() ; j++){
                char letter = word.charAt(j);
                if(letter == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
