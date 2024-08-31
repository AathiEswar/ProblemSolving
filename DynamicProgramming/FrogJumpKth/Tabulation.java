package ProblemSolving.DynamicProgramming.FrogJumpKth;

public class Tabulation {
    public int tabulation(int[] arr , int k ){
        int[] dp = new int[arr.length];
        //Arrays.fill(dp , -1);
        //return recursion(arr , k , arr.length-1 , dp );
        dp[0] = 0;
        if(dp.length < 2){
            return 0;
        }
        dp[1] = Math.abs(arr[0] - arr[1]);

        for(int i = 2 ; i<arr.length ; i++){
            int cur = Integer.MAX_VALUE ;
            for(int j = k ; j > 0 ; j--){
                if(i-j >=0){
                    cur = Math.min(cur , dp[i-j] + Math.abs(arr[i] - arr[i-j]));
                }
            }
            dp[i] = cur;

        }

        return dp[arr.length-1];
    }
}
