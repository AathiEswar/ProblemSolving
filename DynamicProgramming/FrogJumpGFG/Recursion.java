package ProblemSolving.DynamicProgramming.FrogJumpGFG;

public class Recursion {
    public int minimumEnergy(int arr[],int N){
        //code here
        return recursion(arr , arr.length-1);
    }
    public int recursion(int[] arr , int i){
        if(i == 0){
            return 0 ;
        }
        int left = Integer.MAX_VALUE ;
        int right = Integer.MAX_VALUE ;

        left = recursion(arr ,  i-1 ) + Math.abs(arr[i] - arr[i-1] ) ;

        if(i > 1){
            right = recursion(arr , i-2 ) + Math.abs(arr[i] - arr[i-2] ) ;
        }

        return Math.min(left , right);
    }
}

