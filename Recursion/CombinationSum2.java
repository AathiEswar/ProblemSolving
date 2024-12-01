package ProblemSolving.Recursion;

import java.util.*;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        comb(ans , new ArrayList<>() , candidates , target , 0);

        return ans;
    }

    public void comb(List<List<Integer>> ans , List<Integer> dis , int[] can , int target , int ind){
        if(target  == 0){
            ans.add(new ArrayList<>(dis));
        }

        for(int i = ind ; i<can.length ;i++ ){
            if( i > ind && can[i] == can[i-1]){
                continue;
            }
            if(can[i] > target){
                break;
            }

            dis.add(can[i]);
            comb(ans , dis , can , target-can[i] , i+1);
            dis.remove(dis.size() -1);
        }
    }
}
