package ProblemSolving.array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> ans = new ArrayList<>();
            int size = candies.length;
            int max=0;
            for(int i=0;i<size;i++){
                if(candies[i]>max){
                    max=candies[i];
                }
            }
            for(int j=0;j<size;j++){
                if (candies[j]+extraCandies >= max){
                    ans.add(true);
                }
                else{
                    ans.add(false);
                }
            }
            return ans;
        }
    }
}
