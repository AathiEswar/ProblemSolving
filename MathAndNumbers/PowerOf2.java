package ProblemSolving.MathAndNumbers;

public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        // brian Karnigan algorithm - remove last 1's bit
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
