package ProblemSolving.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBInaryTree {
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            if(root==null) return false;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int size = queue.size();
                int flag = 0;
                for(int i=0 ; i< size ; i++){
                    TreeNode cur = queue.poll();

                    if(cur.left != null){

                        queue.offer(cur.left);
                    }
                    if(cur.right != null) {

                        queue.offer(cur.right);
                    }

                    if(cur.left != null && (cur.left.val == x || cur.left.val == y)) flag++;

                    else if(cur.right != null && (cur.right.val == x || cur.right.val == y)) flag++;

                }

                if(flag == 2)return true;

            }
            return false;
        }
    }
}
