package ProblemSolving.String;

import java.util.Arrays;
import java.util.HashSet;

public class CountVowelStringInRange {
    /*
    INFERENCE :
        words - array of Strings ( only lowercase )
        queries - array of array of range

        Will the range always be possible ? eg [2 , 0] -> [0 , 2] or -1 or never occurs

    BRUTE FORCE :
        - have a count array - O(n)
        - loop through the queries
        - loop through the ranges and get the count
        - store them in the currect count arrray index
        - return the array after looping ends

        SP - O(n)
        TC - O(n^2)

    OPTIMIZE IDEAS :
        Optimize the TC - only loop through the queries once
                        and perform an O(1) opertaion to get the count

                        So we need to use some extra space to already hold the values
        PREFIX SUM ?

    OPTIMIZED SOLUTION :
        - Use a Prefix array from start to get the number of vowels start and end
          till any range i
        - get any range of query values with ans = prefix[r] - perfix[l-1]
          ( because to get [1,4] we must have all the elements till 4 and not
          below 1 )

        SP - O(M)
        TC - O( N + M )

*/
    class Solution {
        public int[] vowelStrings(String[] words, int[][] queries) {
            // initialize
            int len = words.length ;
            int[] prefix = new int[len];

            int[] res = new int[queries.length];

            HashSet<Character> lookup = new HashSet<>(
                    Arrays.asList('a' , 'e' ,'i' , 'o' , 'u')
            );

            int count = 0;
            for(int i = 0 ; i < len ;i++){
                String curStr = words[i];
                int curStrLen = curStr.length();

                if(
                        lookup.contains(curStr.charAt(0) ) &&
                                lookup.contains(curStr.charAt(curStrLen-1) ) ){
                    count++;
                }
                prefix[i] = count ;
            }

            for(int i = 0 ; i< queries.length ; i++){
                int start = queries[i][0];
                int end = queries[i][1];

                res[i] = prefix[end] - (start == 0 ? 0 : prefix[start-1]);
            }

            return res;

        }
    }
}
