package ProblemSolving.Graphs;
import java.util.*;
public class FindEventualSafeState {
    class Own{
        public List<Integer> eventualSafeNodes(int[][] graph) {

            int noNodes = graph.length;

            int[] visited = new int[noNodes];
            int[] pathVisited = new int[noNodes];

            List<Integer> result = new ArrayList<>();

            for(int i = 0 ; i< noNodes ; i++){
                if( !dfs(graph , visited , pathVisited , i) ){
                    result.add(i);
                }
            }

            return result ;
        }

        public boolean dfs(int[][] graph , int[] visited , int[] pathVisited , int node){

            visited[node] = 1;
            pathVisited[node] = 1;

            for(Integer adjNode : graph[node]){
                if(visited[adjNode] == 0 && dfs(graph , visited , pathVisited , adjNode)){
                    return true;
                }
                else if(pathVisited[adjNode] == 1){
                    return true;
                }
            }

            pathVisited[node] = 0;
            return false;
        }
    }

    class Optimize{
        public List<Integer> eventualSafeNodes(int[][] graph) {
            // own solution
            int noNodes = graph.length;

            int[] visited = new int[noNodes];

            List<Integer> result = new ArrayList<>();

            for(int i = 0 ; i< noNodes ; i++){
                if( dfs(graph , visited ,  i) ){
                    result.add(i);
                }
            }

            return result ;
        }

        public boolean dfs(int[][] graph , int[] visited , int node){
            if(visited[node] != 0){
                return visited[node] == 2;
            }

            visited[node] = 1;
            for(int adjNode : graph[node]){
                if( ! dfs( graph , visited , adjNode )){
                    return false;
                }
            }

            // if no node is in cycle then change the node to safe state
            visited[node] = 2;
            return true;
        }
    }
}
