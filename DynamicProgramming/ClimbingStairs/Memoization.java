package ProblemSolving.DynamicProgramming.ClimbingStairs;

public class Memoization {
    // Memo
    public int memo(int count , int n , int[] dp){
        if( n < 0){
            return count;
        }
        if(n==0){
            count++;
            return count;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] =  memo(count , n-1 , dp) + memo(count , n-2 , dp);
        return dp[n];
    }
}
