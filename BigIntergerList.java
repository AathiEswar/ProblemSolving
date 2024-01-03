package ProblemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Integer n = arr.size();
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < arr.size(); i++) {
            sum = sum.add(new BigInteger(String.valueOf(arr.get(i))));
        }
        BigInteger sumAll = new BigInteger(String.valueOf(sum));
        BigInteger max = new BigInteger(String.valueOf(Collections.min(arr)));
        BigInteger min = new BigInteger(String.valueOf(Collections.max(arr)));
        BigInteger minSum = sumAll.subtract(max);
        BigInteger maxSum = sumAll.subtract(min);
        // Integer maxSum = sum -  Collections.min(arr);
        // Integer minSum = sum -  Collections.max(arr);

        System.out.println(maxSum+" "+minSum);
    }}

 class BigIntegerList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
