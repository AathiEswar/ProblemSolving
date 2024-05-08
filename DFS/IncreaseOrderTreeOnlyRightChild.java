package ProblemSolving.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  class BestSolutionIncreaseOrder{
      class Solution {
          TreeNode newRoot = null;
          public TreeNode increasingBST(TreeNode root) {
              DFS(root);
              return newRoot;
          }

          private void DFS(TreeNode root){
              if(root == null){
                  return;
              }
              DFS(root.right);
              newRoot = new TreeNode(root.val, null, newRoot);
              DFS(root.left);
          }}
  }
public class IncreaseOrderTreeOnlyRightChild {
    public TreeNode increasingBST2(TreeNode root) {

        ArrayList<TreeNode> list = new ArrayList<>();

        inOrder(root , list);

        for(int i=0;i<list.size()-1;i++){
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
            System.out.println( list.get(i).right.val);
        }
        list.get(list.size()-1).left = null;
        list.get(list.size()-1).right = null;

        return list.get(0);
    }

    public TreeNode ownSolution2(TreeNode root ){
        ArrayList<TreeNode> list = new ArrayList<>();

        inOrder(root , list);
        Collections.sort(list, new Comparator<TreeNode>() {
            @Override
            public int compare( TreeNode p1 , TreeNode p2) {
                return Integer.compare(p1.val, p2.val);
            }
        });

        root = list.get(0);
        for(int i=0;i<list.size()-1;i++){
            System.out.println(list.get(i).val);
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }

        return root;
    }
    public void inOrder(TreeNode root , ArrayList<TreeNode> list){
        if(root == null) return ;

        inOrder(root.left ,list);
        inOrder(root.right ,list);
        root.left = null;
        root.right = null;
        list.add(root);
    }
}
