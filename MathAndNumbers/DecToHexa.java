package ProblemSolving.MathAndNumbers;

import java.util.Scanner;

public class DecToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        decToHexa(dec);
    }
    public static void decToHexa(int dec){
        final String HEXA = "0123456789ABCDEF";
        int rem = 0;
        String str ="";
        char val;
        while(dec!=0){
            rem = dec%16;
            val = HEXA.charAt(rem);
            str = val+str;
            dec /= 16;
        }
        System.out.println(str);
    }

}
