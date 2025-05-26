package ProblemSolving.TrainingArc.DSAPrep.String;

public class LongPaliByConcat2Strings {
    /*
    INFERENCE :
        - Input -> Array of strings
        - Output -> max length of palindrom that can be formed with the input

        - Palindrome must be formed
        - each string is in len of 2

        - when len of array is 0 , return 0
        - when len of array is 1 , string both char is same , return 2 else 0

    BRUTE FORCE :
        - hash map to store the reversed string and their index
        - boolean to check if self palindrom is present
        - initialze count = 0
        - loop through the array
            - check if the current string is alredy in hashmap
                - if so increase count += 4 , remove from hashmap
                - else add invert in hashmap and its index
        - loop through the array
            - if its self pali
                - make boolean true
                - add in hashmap

    ** CANT SOLVE **

    WHAT I DID WRONG :
        - instead of storing index in hashmap , we could store the freq
        - instead of using hashmap we could also use 2 x matrix , coz we always have 2             2 letter strings
        - instead of always trying to handle with a single loop , we can try handle
          diffferent cases in different loops

    SOLUTION :
        - create a 26 x 26 matrix as a hashmap
        - initialize count = 0
        - loop through the array of strings
            - check if the inverted already exist
                - if so then -=1 and increase count by 4
            - else add it to hashmap
        - loop through the hashmap to find the self palindrome :
            - increase count += 2
            - break
        return count
*/
    public int longestPalindrome(String[] words) {
        int[][] map = new int[26][26];
        int count = 0;

        for(String word : words){
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';

            if(map[b][a] > 0){
                count+=4;
                map[b][a]--;
            }
            else{
                map[a][b]++;
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            if(map[i][i] > 0){
                count+=2 ;
                break;
            }
        }
        return count ;
    }
}
