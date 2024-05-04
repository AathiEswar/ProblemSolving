package ProblemSolving.BFS;
import java.util.LinkedList;
import java.util.Queue;

public class ValueInClone {

    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(cloned);

            while(!queue.isEmpty()){
                TreeNode cur = queue.poll();
                if(cur.val == target.val)return cur;

                if(cur.left!= null) queue.offer(cur.left);
                if(cur.right!= null) queue.offer(cur.right);
            }
            return new TreeNode(0);
        }
    }
}
