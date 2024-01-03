package ProblemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        Integer[] arr = StrToInt(val.split(" "));
        int max = findMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
    }
    public static Integer[] StrToInt(String[] arr) {
        Integer[] a = new Integer[arr.length];
        for(int i = 0;i<arr.length;i++){
            a[i] = Integer.valueOf(arr[i]);
        }
        return a;
    }
    public static int findMax(Integer[] a){
        return Collections.max(Arrays.asList(a));
    }
}
