package ProblemSolving;

import java.io.*;
import java.util.*;

class ResultEncrypt {
    public static String caesarCipher(String s, int k) {
        String fin = "";
        for(char ch : s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                int pos = (ch+k);
                int lim = (Character.isUpperCase(ch))?90:122;
                while(pos>lim){
                    pos -=26;
                }
                fin+= (char)pos;
            }
            else{
                fin += ch;
            }
        }
        return fin;
    }

}

public class CeaserCipher {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        String s = sc.nextLine();

        int k = Integer.parseInt(sc.nextLine().trim());

        String result = ResultEncrypt.caesarCipher(s, k);

        System.out.println(result);
    }
}
