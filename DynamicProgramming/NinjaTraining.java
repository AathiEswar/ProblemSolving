package ProblemSolving.DynamicProgramming;

import java.util.Arrays;

public class NinjaTraining {    public static int helper(int day , int last , int[][] points, int[][] dp){
    if(day == 0){
        int maxF = 0;

        for(int task = 0 ;task<3;task++){
            if(task != last){
                maxF = Math.max(maxF , points[0][task]);
            }
        }
        return dp[day][last] = maxF;
    }
    if(dp[day][last] != -1){
        return dp[day][last];
    }

    int maxF = 0;
    for(int task = 0;task<3;task++){
        if(task != last){
            int point = points[day][task] + helper(day-1,task , points , dp);
            maxF = Math.max(maxF , point);
        }
    }
    return dp[day][last] = maxF;
}

    public static int ninjaTraining(int n, int points[][]) {

        int[][] dp = new int[n][4];
        for(int i = 0 ; i< n;i++){
            Arrays.fill(dp[i] , -1);
        }
        // Write your code here..
        return helper(n-1, 3, points , dp);
    }
}
