package ProblemSolving.array;

public class TriangleType {
    public String triangleType(int[] nums) {
        int A = nums[0];
        int B = nums[1];
        int C = nums[2];

        if(A + B <= C || C + B <= A || C+A <= B) return "none" ;
        if (A == B && B == C ) return "equilateral";
        if((A==B & A!=C) ||(A==C & A!=B) || (C==B & C!=A) )return "isosceles";
        else return "scalene";

    }
}
