package ProblemSolving.BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class DepthOfNArrayTree {
    public int depthOfNArrayTree(Node root){
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            depth++;

            int size  = queue.size();

            for(int i=0;i<size;i++){
                Node cur = queue.poll();

                for(Node node : cur.children){
                    queue.offer(node);
                }
            }
        }
        return depth;
    }
}
