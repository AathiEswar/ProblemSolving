package ProblemSolving.array;

public class LongestEvenOddSubArray {
    public int longestEvenOddSubarray(int[] nums , int threshold ){
        int ans = 0;
        int len = nums.length ;
        for(int i = 0 ;i< len ;i++){
            if(nums[i] <= threshold && nums[i] % 2 ==0){
                int e = i+1;
                while(e < len && nums[e] <= threshold && nums[e] %2 != nums[e-1]%2){
                    e++;
                }
                ans = Math.max(ans , e-i);
            }
        }
        return ans;
    }
}
