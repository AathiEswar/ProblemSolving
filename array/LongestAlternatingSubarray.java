package ProblemSolving.array;

public class LongestAlternatingSubarray {
    /*You are given a 0-indexed integer array nums. A subarray s of length m is called alternating if:
     m is greater than 1.
     s1 = s0 + 1.
    The 0-indexed subarray s looks like [s0, s1, s0, s1,...,s(m-1) % 2]. In other words, s1 - s0 = 1, s2 - s1 = -1, s3 - s2 = 1, s4 - s3 = -1, and so on up to s[m - 1] - s[m - 2] = (-1)m.
    Return the maximum length of all alternating subarrays present in nums or -1 if no such subarray exists.
    A subarray is a contiguous non-empty sequence of elements within an array */
    public int longestalternatingSubarray(int [] nums){
        int len = nums.length;
        int resLength= 0;
        for(int i=0;i<len;i++){
            boolean flag = false;
            int sublength = 1;
            for(int j=i+1;j<len;j++){
                if((!flag && nums[j] - nums[j-1] == 1 ) || ( flag && nums[j] - nums[j-1] == -1)){
                    sublength+=1;

                }
                else{
                    break;
                }
                flag = !flag;
                if(resLength < sublength){
                    resLength = sublength;
                }

            }

        }
        return resLength == 1 ? -1 : resLength;
    }
}
