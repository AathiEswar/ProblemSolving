package ProblemSolving.DFS;

import java.util.ArrayList;
import java.util.List;

public class NarayPreOrder {
    class Solution {
        public List<Integer> preorder(Node root) {
            List<Integer> list = new ArrayList<>();

            if(root == null ) return list ;
            helper(root ,list);
            return list;
        }

        public void helper(Node root , List<Integer> list){
            list.add(root.val);
            if(root.children == null){
                return ;
            }

            for(Node child : root.children){
                helper(child , list);
            }
        }
    }
}
