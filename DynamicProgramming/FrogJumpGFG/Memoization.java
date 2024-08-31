package ProblemSolving.DynamicProgramming.FrogJumpGFG;

import java.util.Arrays;

public class Memoization {
    public int minimumEnergy(int arr[],int N){
        //code here
        int[] dp = new int[N];
        Arrays.fill(dp , -1);
        return recursion(arr , arr.length-1 , dp);
    }
    public int recursion(int[] arr , int i , int[] dp){
        if(i == 0){
            return 0 ;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int left = Integer.MAX_VALUE ;
        int right = Integer.MAX_VALUE ;

        left = recursion(arr ,  i-1 , dp ) + Math.abs(arr[i] - arr[i-1] ) ;

        if(i > 1){
            right = recursion(arr , i-2 , dp ) + Math.abs(arr[i] - arr[i-2] ) ;
        }

        dp[i] =  Math.min(left , right);
        return dp[i];
    }
}
