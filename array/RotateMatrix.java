package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;
final class  RotateArray{
public static int[][] set270(int n,int[][] a,SetNGetArr sng){
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <n ; j++) {
        b[i][j] = a[j][n-1-i];
        }
        }
        sng.getArray(n,b);
        return b;
        }
public static int[][] set90(int n,int[][] a,SetNGetArr sng){
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <n ; j++) {
        b[i][j] = a[n-1-j][i];
        }
        }
    sng.getArray(n,b);
        return b;
        }
public static int[][] set180(int n,int[][] a,SetNGetArr sng){
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j <n ; j++) {
        b[j][i] = a[n-j-1][n-i-1];
        }
        }
    sng.getArray(n,b);
        return b;
        }
        }
final class SetNGetArr{
    public static void setArray(int n , int[][] a){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    }
    public static void getArray(int n,int[][] a){
        System.out.println("The Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
final class MainDisp{
    public static void optionLoop(int n,int[][] a,RotateArray ar,SetNGetArr sng,Scanner sc){
        int ch=0;
        do{
            System.out.println("Enter choice: \n1)Set 90 \n2)Set 180 \n3)Set270");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    a = ar.set90(n,a,sng);

                    break;
                case 2:
                    a = ar.set180(n,a,sng);
                    break;
                case 3:
                    a = ar.set270(n,a,sng);

                    break;
                case 0:
                    System.out.println("Process finished");
                    break;
            }
        }while(ch!=0);
    }
}
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateArray ar = new RotateArray();
        SetNGetArr sng = new SetNGetArr();
        MainDisp md = new MainDisp();
        System.out.println("Enter the dimension of the matrix:");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        sng.setArray(n,a);
        md.optionLoop(n,a,ar,sng,sc);
    }



}
