package ProblemSolving.array;

public class FindMInOperations3 {
    public int minimumOperations(int[] nums) {
        int count = 0 ;

        for(int num : nums){
            if(num % 3 != 0 ){
                count++;
            }
        }

        return count;
    }
}
