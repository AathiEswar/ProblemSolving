package ProblemSolving.MathAndNumbers;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sumDigSingle(555555555));
    }

    public static int sumDigSingle(int n){
        if(n == 0){
            return 0;
        }
        return n%9 == 0 ?  9: n%9 ;
    }
}
