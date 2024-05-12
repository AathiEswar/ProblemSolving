package ProblemSolving.DFS;

public class DiameterOfBinaryTree {

    class SolutionOWN {
        int sum= 0;
        public int diameterOfBinaryTree(TreeNode root) {
            maxSum(root);
            return sum;
        }

        public void maxSum(TreeNode root){
            if(root == null) return ;

            maxSum(root.left);

            sum = Math.max(sum , diameterFinder(root));

            maxSum(root.right);
        }

        public int diameterFinder(TreeNode root){
            return helper(root.left) + helper(root.right);
        }

        public int helper(TreeNode root){
            if(root == null) return 0;

            return 1+ Math.max(helper(root.left) , helper(root.right));
        }
    }

    class SolutionBEST {
        int sum= 0;
        public int diameterOfBinaryTree(TreeNode root) {
            helper(root);
            return sum;
        }


        public int helper(TreeNode root){
            if(root == null) return 0;

            int left = helper(root.left);
            int right = helper(root.right);

            sum = Math.max(sum , left + right );

            return 1+ Math.max( left , right );
        }
    }
}
