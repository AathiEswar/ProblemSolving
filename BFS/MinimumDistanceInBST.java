package ProblemSolving.BFS;

import java.util.ArrayList;

public class MinimumDistanceInBST {
    class Solution {
        public int minDiffInBST(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();

            populateList(root , list);

            int minSum = Integer.MAX_VALUE;

            for(int i=1;i<list.size();i++){
                minSum = Math.min(minSum , list.get(i) - list.get(i-1));
            }

            return minSum;
        }

        public void populateList(TreeNode root , ArrayList<Integer> list){
            if(root == null)return ;

            populateList(root.left , list);
            list.add(root.val);
            populateList(root.right , list);
        }
    }
}
