package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;


public class BestBubble {
        static int countAsc = 0;
        static  int countDesc = 0;
    static void bubbleSort(int[] arr1, int[]arr2) {
        int n = arr1.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr1[j - 1] > arr1[j]) {
                    //swap elements
                    temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;
                    countAsc++;
                }
                if (arr2[j - 1] < arr2[j]) {
                    //swap elements
                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                    countDesc++;
                }

            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String res = sc.nextLine();
        String[] arrStr = res.split(" ");
        System.out.println(Arrays.toString(arrStr));

        int[] arrInt2 = new int[arrStr.length];
        int[] arrInt1 =  new int[arrStr.length];

        for(int i=0;i<arrInt1.length;i++){
            arrInt1[i] = Integer.parseInt(arrStr[i]);
            arrInt2[i] = Integer.parseInt(arrStr[i]);
        }

        bubbleSort(arrInt1,arrInt2);
        System.out.println(countAsc>countDesc?countDesc:countAsc);



    }
}