package ProblemSolving.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBT {
    public int minDepthBFS(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return level;
                }

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return level;
    }

    public int minDepth(TreeNode root){
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        if(root.left == null) return 1+ minDepth(root.right);
        if(root.right == null) return 1+ minDepth(root.left);

        return 1+Math.min(minDepth(root.left) , minDepth(root.right));
    }
}
