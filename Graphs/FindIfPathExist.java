package ProblemSolving.Graphs;
import java.util.*;
public class FindIfPathExist {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // create a storing list and populate it
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adjList.get(v).add(u);
            adjList.get(u).add(v);
        }

        // use bfs to find the visited array
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            Integer node = queue.poll();

            for(Integer adjNode : adjList.get(node)){
                if(!visited[adjNode]){
                    queue.offer(adjNode);
                    visited[adjNode] = true;
                }
            }
        }

        return visited[destination];
    }
}
