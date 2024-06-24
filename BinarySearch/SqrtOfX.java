package ProblemSolving.BinarySearch;

public class SqrtOfX {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;

        int ans = 0;

        while(start <= end){
            long mid = start + (end - start )/2;


            if( mid * mid  == (long)x){
                return (int)mid;
            }
            else if(  mid * mid  < (long)x){
                ans = (int)mid;
                start = (int)(mid + 1);
            }
            else {
                end = (int)(mid - 1);
            }

        }

        return ans;
    }
}
