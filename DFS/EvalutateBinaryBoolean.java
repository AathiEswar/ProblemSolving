package ProblemSolving.DFS;

import ProblemSolving.BFS.TreeNode;

public class EvalutateBinaryBoolean {
    public boolean evaluateBoolean (TreeNode root){
        if(root.left == null && root.right == null) {
            if(root.val == 0)return false;
            return true;
        }
        boolean left = evaluateBoolean(root.left);
        boolean right = evaluateBoolean(root.right);

        if(root.val == 2) return left||right;

        return left&&right;
    }
}
