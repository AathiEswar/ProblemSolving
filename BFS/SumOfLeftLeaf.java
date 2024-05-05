package ProblemSolving.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaf {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return 0;

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i= 0 ;i< size;i++){
                TreeNode cur = queue.poll();

                if(cur.left!= null){
                    queue.offer(cur.left);
                    if(cur.left.left == null && cur.left.right == null) sum+= cur.left.val;
                };
                if(cur.right!= null) queue.offer(cur.right);
            }


        }

        return sum;
    }
}
