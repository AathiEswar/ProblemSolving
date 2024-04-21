package ProblemSolving.array;

public class ShuffleTheArray {
    /* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn]. */
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int len = nums.length;

            for(int i=n ; i < len ;i++){
                nums[i] = nums[i] + (nums[i-n] * 1024);
            }
            int j=0;
            for(int i = n ; i<len ;i++ , j+=2){
                nums[j] = nums[i] / 1024;
                nums[j+1] = nums[i] % 1024;
            }
            return nums;
        }
    }
}
