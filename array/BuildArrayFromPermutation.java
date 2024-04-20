package ProblemSolving.array;

public class BuildArrayFromPermutation {
    public int[] buildArrayFromPermutation(int[] nums){
        //normal SC : 0(N)
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i <n ; i++) {
            result[i] = nums[nums[i]];
        }
        //TC : 0(1)
       // self encoding of elements to store two elements in one
       // a & b where    a = a + (b%n) * m
       // retrieve a ->  a = a%n
       // retrieve b -> b = b/n;

        for (int i = 0; i <n ; i++) {
           nums[i] = nums[i] + (nums[nums[i]] % n ) * n;
        }

        for (int i = 0; i < n; i++) {
           nums[i] = nums[i] / n;
        }
        return result;
    }
}
