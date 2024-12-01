package ProblemSolving.Recursion;

import java.util.*;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        // Own
        List<List<Integer>> res = new ArrayList<>();
        comb(res , new ArrayList<>(), k,1 ,n );
        return res;
    }

    public void comb(List<List<Integer>> res , List<Integer> dis , int k , int i , int n){
        if(i > n){
            if(dis.size() == k){
                res.add(new ArrayList<>(dis));
            }
            return ;
        }
        // take
        dis.add(i);
        comb(res , dis,k , i+1 , n);
        dis.remove(dis.size()-1);

        // leave
        comb(res , dis , k , i+1 , n);
    }
}
