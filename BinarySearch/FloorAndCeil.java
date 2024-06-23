package ProblemSolving.BinarySearch;

public class FloorAndCeil {
    public int[] floorAndCeil(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        int floor = -1;
        int ceil = -1;

        while(start <= end){
           int mid = start + (end - start)/2;

           if(nums[mid] == target){
               return new int[]{nums[mid] , nums[mid]};
           }
           else if(nums[mid] < target) {
               floor = nums[mid] ;
               start = mid + 1;
            }
           else{
               ceil = nums[mid] ;
               end = mid - 1;
           }
        }

        return new int[] { floor , ceil };
    }
}
