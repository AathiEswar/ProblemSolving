package ProblemSolving.BinarySearch;

public class LowerBond {
    public int lowerBond(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        int mid;
        int ans = -1;

        while(start <= end){
            mid = start + (end - start )/2;

            if(arr[mid] <= target) {
                ans = mid;
                start = mid+1;
            }
            else{
                end = end-1;
            }

        }
        return ans;
    }
}
