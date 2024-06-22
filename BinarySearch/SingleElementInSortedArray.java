package ProblemSolving.BinarySearch;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end-start) / 2;

            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){
                start += 2;
            }
            else{
                end = mid -1;
            }
        }

        return nums[start];
    }
}
