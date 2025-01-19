package ProblemSolving.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
        /*
            INFERENCE :
                it is always possible to get a combination
                candidate array has unique elements
                if len is one , then ele == sum ?
                the combinations need not to be unique eg - ( 2,2,3 -> 7 )
                return list<list>>

            BRUTE FORCE :
                - Check every posssible combination that includes that element itself
                - base case:
                    * if target == 0
                        add to some sub list to res list
                    * if target < 0 :
                        return target
                -  decisions :
                    * target = target - cand[i]
                    f( i + 1 )
                    f(i)

                    TC - O( 2 ^ t * k ) -> every number needs to be checked till target and adding
                        subList to res array is k times

                    SC - k * x ( hypothetical )
        */
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();

            combination(res , candidates , target , new ArrayList<>() , 0);

            return res ;
        }

        public static void combination( List<List<Integer>> res , int[] candidates , int target,
                                        List<Integer> subList , int index){
            // if we reached target add to main res and return
            if(target == 0){
                List<Integer> subRes = new ArrayList<>(subList);
                res.add(subRes);
                return ;
            }

            // to prevent index out of bounds
            if(index >= candidates.length){
                return ;
            }

            // do not pick and move on
            combination(res , candidates , target , subList , index + 1);

            // if the element is suitable for picking
            if(target >= candidates[index]){

                // add to list coz its suitable
                subList.add(candidates[index]);
                // pick and stay
                combination(res , candidates , target - candidates[index] , subList , index);
                // remove from sublist for further processing
                subList.remove(subList.size() - 1);
            }

        }
    }
}
