package ProblemSolving.DFS;

import java.util.ArrayList;
import java.util.List;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
/*  Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
    Nary-Tree input serialization is represented in their level order traversal.
    Each group of children is separated by the null value  */
public class NarrayPostOrderTraversal {
    public List<Integer> nArrayPostOrder(Node root ){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        helper(root , res);
        return res;
    }

    private void helper(Node root, List<Integer> res) {
        if(root.children == null){
            res.add(root.val);
            return ;
        }

        for(Node child : root.children){
            helper(child , res);
        }

        res.add(root.val);
    }
}
