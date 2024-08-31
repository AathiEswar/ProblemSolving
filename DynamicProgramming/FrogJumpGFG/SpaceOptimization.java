package ProblemSolving.DynamicProgramming.FrogJumpGFG;

public class SpaceOptimization {
    public int spaceOptimization(int[] arr , int N){
        if (arr.length < 2){
            return 0;
        }

        int prev1 = Math.abs(arr[0]-arr[1]);
        int prev2 = 0;

        for(int i = 2 ; i<N  ; i++){
            int left = prev2 + Math.abs(arr[i] - arr[i-2]);
            int right = prev1 + Math.abs(arr[i] - arr[i-1]);
            int cur = Math.min(left , right);
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
}
