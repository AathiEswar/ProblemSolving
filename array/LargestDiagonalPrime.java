package ProblemSolving.array;

public class LargestDiagonalPrime {
    public int largestDiagonalPrime(int[][] nums){
        int len = nums.length;

        int maxPrime = 0 ;

        for(int i=0 ;i<len;i++){
            if(maxPrime > nums[i][i] && isPrime(nums[i][i])){
                maxPrime = nums[i][i];
            }

            if(maxPrime > nums[i][len-1-i] && isPrime(nums[i][len-1-i])){
                maxPrime = nums[i][len-1-i];
            }
        }
        return maxPrime;
    }

    private boolean isPrime(int num) {
        if(num <= 1) return false;

        if(num == 2 || num == 3 ) return true;

        if(num % 2 == 0 || num % 3 == 0) return false;

            for(int i = 5;i<Math.sqrt(num) ; i+=6){
                if(num%i == 0 || num % (i+2) == 0 ){
                    return false;
                }
            }
        return true;
    }
}
