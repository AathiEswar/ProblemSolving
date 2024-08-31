package ProblemSolving.DynamicProgramming.FrogJumpKth;

public class Memoization {
    public int memo(int[] arr , int k , int i , int[] dp ){
        if( i == 0 ){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int cur = Integer.MAX_VALUE ;

        for(int j = k ; j > 0 ; j--){
            if(i-j >= 0){
                cur = Math.min(cur , memo(arr , k , i-j , dp)+ Math.abs(arr[i] - arr[i-j]));
            }
        }
        dp[i] = cur;
        return dp[i];

    }
}
