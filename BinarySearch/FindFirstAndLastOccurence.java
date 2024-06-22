package ProblemSolving.BinarySearch;

public class FindFirstAndLastOccurence {
    public int[] findOccurence(int[] nums , int target){
        // initialize default answer
        int[] ans = {-1 , -1};

        ans[0] = searchHelper(nums , target , true);
        if(ans[0] != -1){
            ans[1] = searchHelper(nums , target , false);
        }

        return ans;
    }

    private int searchHelper(int[] nums, int target, boolean isFirstFound) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start <= end){
           int mid = start + ( end - start)/2;

           if(nums[mid] < target){
               start = mid + 1;
           }
           else if(nums[mid] > target){
               end = mid - 1;
           }
           else{
               ans = mid ;
               if(isFirstFound){
                   end = mid - 1;
               }
               else {
                   start = mid + 1;
               }
           }


        }
        return ans;
    }
}
