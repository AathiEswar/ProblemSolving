package ProblemSolving.BFS;

public class DeleteANodeBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        // check if root is null then no need to delete
        if(root == null){
            return null;
        }
        // iterate through the bst

        // if larger go to right
        if(root.val < key){
            root.right = deleteNode(root.right , key);
        }
        // if lesser go to left
        else if(root.val > key){
            root.left = deleteNode(root.left , key);
        }
        // if found
        else{
            // key is founded

            // if leaf node then that val is null
            if(root.left == null && root.right == null){
                return null;
            }

            // if only left exist return right
            else if(root.left == null){
                return root.right;
            }

            // if only right exist return left
            else if (root.right == null){
                return root.left;
            }

            // if both child exist find successor
            else{
                // find successor
                TreeNode successor = root.right;
                // successor is leftmost of right or rightmost of left
                while(successor.left != null){
                    successor = successor.left;
                }

                // replace the founded val with the successor
                root.val = successor.val;

                // delete the successor itself
                root.right = deleteNode(root.right , successor.val);

            }

        }

        // return the final answer
        return root;
    }
}
