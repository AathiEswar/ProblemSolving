package ProblemSolving.Graphs;

import java.util.*;

public class WordLadder1 {
    class Pair{
        String word;
        int seq;

        Pair(String word , int seq){
            this.word = word;
            this.seq = seq;
        }
    }

    class Solution {
        // Input - startWord , endWord , wordList
        // Output - min sequence for startword to endword
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            HashSet<String> set = new HashSet<>();
            for(String word : wordList){
                set.add(word);
            }

            Queue<Pair> queue = new LinkedList<>();
            queue.offer(new Pair(beginWord , 1));

            while(!queue.isEmpty()){
                String word = queue.peek().word;
                int len = queue.peek().seq;
                queue.poll();

                if(word.equals(endWord)) return len ;

                for(int i = 0;i<word.length() ;i++){
                    for(char j = 'a' ; j<='z' ;j++){
                        char[] newWord = word.toCharArray();
                        newWord[i] = j;
                        String strWord = new String(newWord);

                        if(set.contains(strWord)){
                            set.remove(strWord);
                            queue.offer(new Pair(strWord , len+1));
                        }
                    }
                }
            }
            return 0;
        }
    }
}
