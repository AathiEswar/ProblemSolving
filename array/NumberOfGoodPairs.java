package ProblemSolving.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

   // a pais is said to be good pair if num[i] == nums[j] and  i <j;
    public int numberOfGoodPairs(int[] nums){
        int result = 0;

        // array approach

        int[] lookup = new int[100];
        for (int i = 0; i <nums.length ; i++) {
            result += lookup[nums[i]]++;
        }


        // hashmap approach

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                result += map.get(nums[i]);
                map.put(nums[i] , map.get(nums[i])+1  );
            }
        }
            return result;
    }
}
