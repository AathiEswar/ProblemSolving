package ProblemSolving.array;

public class SmallestMissingIntegerSeq {
    /*  You are given a 0-indexed array of integers nums.
        A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1.
        In particular, the prefix consisting only of nums[0] is sequential.
        Return the smallest integer x missing from nums such that x is greater
        than or equal to the sum of the longest sequential prefix. */
    public int smallestMissingIntegerSeq(int[] nums){
        int sum = nums[0];
        int len = nums.length;

        for(int i=1;i<len;i++){
            if(nums[i] == nums[i-1]+1){
                sum+= nums[i];
            }
            else{
                break;
            }
        }
        for(int i=0;i<len;i++){
            if(sum == nums[i]){
                sum++;
                i=0;
            }
        }
        return sum;
    }
}
