package ProblemSolving.array;

public class ValidMountain {
    /* Given an array of integers arr, return true if and only if it is a valid mountain array.

    Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1] */
    class Solution {
        public boolean validMountainArray(int[] arr) {
            int len = arr.length;
            if(len < 3)return false;

            int peak = arr[0];
            int peakIndex = 0;

            for(int i=1;i<len ;i++){
                if(arr[i] > peak){
                    peak = arr[i];
                    peakIndex = i;
                }
                else{
                    break;
                }
            }

            for(int i = peakIndex ;i<len-1;i++){
                if(arr[i] <= arr[i+1]){
                    return false;
                }
            }

            return peakIndex < len-1 && peakIndex > 0;
        }
    }
}
