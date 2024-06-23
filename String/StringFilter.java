package ProblemSolving.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class StringFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textOfArrays = sc.nextLine();
        String[] textArr = textOfArrays.split(" ");
        int lim = sc.nextInt();
        List<String> newArr = filterArray(lim,textArr);
        System.out.println(newArr);

    }
    public static List<String> filterArray(int lim , String[] arr){
        List<String> newArr = new ArrayList<>();
        for (String str: arr) {
            if(str.length()>= lim){
                newArr.add(str);
            }
        }
        return newArr;
    }
}
