package ProblemSolving.HashFunctions;

public class CountPreNSuffix {
    public int countPrefixSuffixPairs2(String[] words) {
        int count = 0;

        for(int i = 0;i<words.length-1;i++){
            for(int j = i+1 ; j<words.length ; j++){

                if(words[i].length() <= words[j].length() ){

                    if(preSuf(words[j] , words[i]) ){
                        count+=1;
                    }
                }
            }
        }

        return count;
    }

    public boolean preSuf(String s , String pre){

        boolean isPrefix = true;
        int sLen = s.length();
        int preLen = pre.length();

        for(int i= 0; i<preLen ;i++){

            if(pre.charAt(i) != s.charAt(i)){
                return false;
            }
            if(pre.charAt(preLen-i-1) != s.charAt(sLen-i-1)){
                return false;
            }
        }

        return true;
    }
}
