package ProblemSolving.DynamicProgramming.FrogJumpGFG;

public class Tabulation {
    public int tabulation(int[] arr , int N){
        int[] dp = new int[N];
        dp[0] = 0;

        if (arr.length < 2){
            return dp[0];
        }

        dp[1] = Math.abs(arr[0]-arr[1]);

        for(int i = 2 ; i<N  ; i++){
            int left = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            int right = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            dp[i] = Math.min(left , right);
        }

        return dp[N-1];

    }
}
