package ProblemSolving.DynamicProgramming.FrogJumpKth;

public class Recursion {
    public int recursion(int[] arr , int k , int i ){
        if( i == 0 ){
            return 0;
        }
        int cur = Integer.MAX_VALUE ;

        for(int j = k ; j > 0 ; j--){
            if(i-j >= 0){
                cur = Math.min(cur , recursion(arr , k , i-j )+ Math.abs(arr[i] - arr[i-j]));
            }
        }
        return cur ;
    }
}
