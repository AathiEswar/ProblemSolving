package ProblemSolving.Graphs;
import java.util.*;
public class NumberOfProvinces {
    class OptimizedSolution{
        public int findCircleNum(int[][] isConnected) {
            int noOfNodes = isConnected.length ;
            int[] visited = new int[noOfNodes];
            int count = 0 ;
            for(int i = 0 ; i < noOfNodes ; i++){
                if(visited[i] != 1){
                    count++;
                    dfs(isConnected , visited , i);
                }
            }
            return count;
        }
        public void dfs(int[][] isConnected , int[] visited , int rowIndex){

            for(int j = 0 ; j < isConnected.length;j++){
                if(visited[j] != 1 && isConnected[rowIndex][j] == 1){
                    visited[j] = 1;
                    dfs(isConnected , visited , j);
                }
            }
        }
    }
    public int findCircleNumOWN(int[][] isConnected) {
        // own solution
        List<List<Integer>> adjList = new ArrayList<>();
        int noOfNodes = isConnected.length;
        // populate
        for(int i = 0 ; i<noOfNodes ; i++){
            adjList.add(new ArrayList<>());
        }

        // create adjList
        for(int i = 0 ; i < noOfNodes ; i++){
            for(int j = 0 ; j < noOfNodes ; j++){
                if(j == i){
                    continue;
                }
                else{
                    if(isConnected[i][j] == 1){
                        adjList.get(i).add(j);
                    }
                }
            }
        }

        // bfs and find the visited nodes
        boolean[] visited = new boolean[noOfNodes];

        int count = 0;

        for(int i = 0 ; i< noOfNodes;i++ ){
            if(!visited[i]){
                count++;
                dfsOwn(visited , i , adjList);
            }
        }


        return count ;

    }

    public void dfsOwn(boolean[] visited , int node , List<List<Integer>> adjList){
        visited[node] = true;
        for(Integer adjNode : adjList.get(node)){
            if(!visited[adjNode]){
                dfsOwn(visited , adjNode , adjList);
            }
        }
    }
}
