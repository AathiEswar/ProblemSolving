package ProblemSolving.BFS;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1 , TreeNode root2){
        if(root1 == null ) return root2;
        if (root2  == null ) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left , root2.left);
        root2.right = mergeTrees(root2.right ,root1.right);
        return root1;
    }
}
