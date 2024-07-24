package ProblemSolving.Graphs;
import java.util.*;
public class CycleInDirectedGraph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here

        int[] visited = new int[V];
        int[] pathVisited = new int[V];

        for(int i = 0 ; i < V ; i++){
            if(visited[i] != 1 && dfs(adj , visited , pathVisited , i )){
                return true;
            }
        }

        return false ;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList , int[] visited , int[] pathVisited , int node){
        // mark visited and path as 1
        visited[node] = 1;
        pathVisited[node] = 1;

        // iterate through the adjNodes
        for(Integer adjNode : adjList.get(node)){

            // if its unvisited and the dfs deducts cycle return true
            if(visited[adjNode] == 0 && dfs(adjList ,visited , pathVisited , adjNode)){
                return true;
            }
            // if the path is already visited return true
            else if (pathVisited[adjNode] == 1){
                return true;
            }
        }
       // if there is no cycle change the path to unvisited for next iteration and return false;
        pathVisited[node] = 0;
        return false;
    }
}
