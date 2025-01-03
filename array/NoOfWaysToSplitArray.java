package ProblemSolving.array;

public class NoOfWaysToSplitArray {
    class Solution {
        public int waysToSplitArray(int[] nums) {
            int len = nums.length;

            long[] prefix = new long[len];
            long[] suffix = new long[len];

            long sum = 0;
            for(int i = len-1 ; i>=0 ; i--){
                suffix[i] = nums[i] +  sum ;
                sum = suffix[i];
            }

            int count = 0;
            sum=0;
            for(int i=0 ; i<len-1 ;i++ ){
                sum = nums[i] + sum;
                if(sum >= suffix[i+1]){
                    count++;
                }
            }
            return count;
        }
    }
}
