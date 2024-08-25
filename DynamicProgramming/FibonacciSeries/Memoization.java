package ProblemSolving.DynamicProgramming.FibonacciSeries;

import java.util.Arrays;

public class Memoization {
    public static int fmemo(int n , int[] dp){
        if(n <=1 ){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fmemo(n-1 , dp) + fmemo(n-2 , dp);

        return dp[n];
    }
}
