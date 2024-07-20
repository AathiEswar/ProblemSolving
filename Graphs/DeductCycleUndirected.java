package ProblemSolving.Graphs;
import java.util.*;
public class DeductCycleUndirected {
    // for every component-graph check if already visited node is not their parent
    public boolean BFSDeduction(int source , ArrayList<ArrayList<Integer>> adjList ,int[] visited ){
        // normal BFS
        visited[source] = 1;
        Queue<int[] > queue = new LinkedList<>();
        queue.offer(new int[]{source , -1});

        while(!queue.isEmpty()){
            int node = queue.peek()[0];
            int parent = queue.peek()[1];

            queue.poll();

            for(Integer adjNodes : adjList.get(node)){
                if(visited[adjNodes] == 0){
                    visited[adjNodes] = 1;
                    queue.offer(new int[]{adjNodes ,node });
                }
                // when the already visited node is not their parent it must mean someone else must have did it and its a cycle
                else if(parent != adjNodes){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {


        int[] visited = new int[V];

        for(int i = 0 ; i<V ; i++){
            // if the node is unvisited
            if(visited[i] == 0){
                // it might be a new component graph

                if(BFSDeduction(i , adj , visited)){
                    // if a cycle is deducted in this component return true;
                    return true;
                }
            }
        }
        return false;
    }
}
