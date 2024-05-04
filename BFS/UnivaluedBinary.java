package ProblemSolving.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class UnivaluedBinary {
    /*
     A binary tree is uni-valued if every node
    in the tree has the same value.
    Given the root of a binary tree, return true
    if the given tree is uni-valued, or false otherwise.
     */
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int univalue = root.val;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();

                if(cur.val != univalue) return false;

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
        }

        return true;

    }

    public boolean uniValuedDFS(TreeNode root ){
        if(root == null) return false;
        return helper(root , root.val);
    }

    private boolean helper(TreeNode root, int val) {
        if(root == null) return true;

        if(root.val!= val) return false;

        else return helper(root.left , val) && helper(root.right , val);
    }
}
