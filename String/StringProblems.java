package ProblemSolving.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringProblems {
    public static void toASCII(String str){
        char ch = str.charAt(0);
        System.out.println("The ascii value : "+ (int)ch);
    }
    public static int findLength(String str){
        if(str == ""){
            return 0;
        }
        else {
            return findLength(str.substring(1))+1;
        }}
    public static void toggleCases(String str){
        String strFin = "";
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                strFin+= Character.toLowerCase(ch);
            }
            else {
                strFin+= Character.toUpperCase(ch);
            }
        }
        System.out.println(strFin);
    }
    public static void containsVowels(String str){
        final String  VOWELS = "aeiouAEIOU";
        int vowCount=0,consCount =0,specCount = 0 ;

        for(int i = 0;i<str.length();i++){
            if(VOWELS.indexOf(str.charAt(i))!= -1){
                vowCount++;
            }
            else if(Character.isAlphabetic(str.charAt(i))){
                consCount++;
            }
            else{
                specCount++;
            }
        }
        System.out.println("The vowel count:"+vowCount);
        System.out.println("The consonant count :"+consCount);
        System.out.println("The vowel count:"+specCount);
    }
    public static void isPalindrome(String str){
        char[] chStr = str.toCharArray();
        boolean isPali = true;
        for(int i = 0; i < chStr.length/2; i++) {
           if (chStr[i] != chStr[chStr.length-1-i]){
               isPali = false;
           }}
        System.out.println(isPali?"is pali":"not pali");
}
    public static void reverseString(String str){
        //using string builder
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());

        //using charArray
        char[] charArray = str.toCharArray();
        for(int i=0;i< charArray.length/2;i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length-1-i];
            charArray[charArray.length-1-i] = temp;
        }
        System.out.println(String.valueOf(charArray));


    }

    public static void removeS2(String s1,String s2){
        for(int i = 0;i<s2.length();i++){
            String s2Char =s2.charAt(i)+"";
            while (s1.contains(s2Char)){
                String s1Char = s1.charAt(s1.indexOf(s2Char))+"";
                s1 = s1.replace(s1Char,"");
            }

        }
        System.out.println(s1);
    }
    public static void removeNotAlpha(String str){
//        for (int i = 0; i < str.length(); i++) {
//            if(!Character.isAlphabetic(str.charAt(i))){
//               str =  str.replace(String.valueOf(str.charAt(i)),"");
//               i--;
//            }
//        }
//        System.out.println(str);
        str = str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
        //*******ONLY SPACE REMOVE LOGIC:*************
//        str = str.replaceAll(" ","");
//        System.out.println(str);
    }
    public static void addAllInt(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(Integer.valueOf(str.charAt(i)))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
    public static void firNLastToUpper(String str){
        String newString = "";
        String[] strArr = str.split(" ");
        for(String ele : strArr){
            char first = ele.charAt(0);
            char last = ele.charAt(ele.length()-1);
            String rest = ele.substring(1,ele.length()-1);
            newString+= Character.toUpperCase(first) + rest.toLowerCase() + Character.toUpperCase(last)+ " ";
        }
        System.out.println(newString);

    }
    public static void freqOfString(String str){
        char[] chArr = str.toCharArray();
        int[] freq = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(chArr[i] == chArr[j]){
                    freq[i]++;
                    chArr[j] = '0';
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(chArr[i] != '0' && chArr[i] != ' '){
                System.out.println(chArr[i]+" " + freq[i]);
            }
        }
    }
    public static void isAnagram(String str1,Scanner sc){
        String str2 = sc.nextLine();
        boolean isAna = true;
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        if(str1.length() == str2.length()){
            for (int i = 0; i < str1Arr.length; i++) {
                if(str1Arr[i] != str2Arr[i]){
                    isAna = false;
                }
            }
        }
        System.out.println(isAna);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        toASCII(str);
//        System.out.println(findLength(str));
//        toggleCases(str);
//        containsVowels(str);
//        isPalindrome(str);
        reverseString(str);
//        removeNotAlpha(str);
//        addAllInt(str);
//        firNLastToUpper(str);
//        freqOfString(str);
//        isAnagram(str,sc);
//        removeS2("aathi eswar","ae");

    }}
