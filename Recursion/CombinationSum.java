package ProblemSolving.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            comb(ans , new ArrayList<Integer>() , candidates , 0 , target);

            return ans;

        }
        public void comb(List<List<Integer>> ans ,
                         List<Integer> dis, int[] candidates , int index , int target){
            if(index == candidates.length){
                if(target == 0){
                    ans.add(new ArrayList<>(dis));
                }
                return ;
            }
            if(candidates[index] <= target){
                dis.add(candidates[index]);
                comb(ans , dis , candidates , index , target-candidates[index]);
                dis.remove(dis.size()-1);
            }

            comb(ans , dis , candidates , index+1 , target);
        }
    }
}
