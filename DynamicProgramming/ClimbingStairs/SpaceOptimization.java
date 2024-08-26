package ProblemSolving.DynamicProgramming.ClimbingStairs;

public class SpaceOptimization {
    public int spaceOptimization(int n ){
        // SPACE OPTIMIZATION :
        if(n < 4){
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;

        for(int i = 3 ; i <= n ; i++){
            int cur = prev2 + prev1 ;
            prev2 = prev1;
            prev1 = cur ;
        }

        return prev1;
    }
}
