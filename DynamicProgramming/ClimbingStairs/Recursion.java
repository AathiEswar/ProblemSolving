package ProblemSolving.DynamicProgramming.ClimbingStairs;

public class Recursion {
    // Recursion
    public int recursion(int count , int n ){
        if( n < 0){
            return count;
        }
        if(n==0){
            count++;
            return count;
        }
        return recursion(count , n-1) + recursion(count , n-2);
    }
}
