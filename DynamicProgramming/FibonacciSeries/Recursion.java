package ProblemSolving.DynamicProgramming.FibonacciSeries;

public class Recursion {
    public int f(int n){
        if(n <= 1){
            return n;
        }
        return f(n-1) + f(n-2);
    }
}