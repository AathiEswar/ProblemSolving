package ProblemSolving.greedy;

import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int leng = g.length;
        int lens = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0;
        int r = 0;

        while(l<lens && r<leng){
            if(g[r] <= s[l]){
                r++;
            }
            l++;
        }

        return r;
    }
}
