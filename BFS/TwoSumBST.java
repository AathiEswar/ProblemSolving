package ProblemSolving.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TwoSumBST {
    public Boolean twosumBSTOwnSolution(TreeNode root ,int target){
        if(root== null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<Integer> elements = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                elements.add(cur.val);
                int comp =  target- cur.val;
                if(elements.contains(comp) && comp != cur.val )return true;
                if(cur.left != null ) queue.offer(cur.left);
                if(cur.right != null ) queue.offer(cur.right);
            }
        }



        return false;

    }


    public boolean twosumSol1(TreeNode root , int target){
        ArrayList<Integer> list = new ArrayList<>();
        helper1(root , target ,list);
        int start = 0;
        int end = list.size();

        while(start < end){
            if(list.get(start) + list.get(end) == target) return true;
            else if(list.get(start) + list.get(end ) < target) start++;
            else end--;
        }
        return false;
    }

    public void helper1 (TreeNode root , int target , ArrayList<Integer> list){
        if(root == null)return ;
        helper1(root.left , target , list);
        list.add(root.val);
        helper1(root.right , target , list);

    }


    //Solution 2

    public boolean twosumSol2(TreeNode root , int target){
        ArrayList<Integer> list =  new ArrayList<>();

        return helper2(root , target , list);
    }

    private boolean helper2(TreeNode root, int target, ArrayList<Integer> list) {
        if(root == null) return false;

        if(list.contains(target - root.val)) return true;
        list.add(root.val);

        return helper2(root , target ,list) || helper2(root , target , list);
    }
}
