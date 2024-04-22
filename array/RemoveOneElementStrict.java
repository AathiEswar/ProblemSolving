package ProblemSolving.array;

public class RemoveOneElementStrict {
    public int removeOneElementStrict(int[] nums){
        /*   Given a 0-indexed integer array nums, return true if it can be made strictly
        increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
        The array nums is strictly increasing if nums[i - 1] < nums[i]
        for each index (1 <= i < nums.length). */

        int count = 0 ;
       for(int i=1;i<nums.length ; i++) {
           if(nums[i] <= nums[i-1]){
               count++;

               if(nums[i] <= nums[i-2] && i < 1){
                   nums[i] = nums[i-1];
               }
           }
       }
        return count ;
    }
}
