package ProblemSolving.Graphs;
import java.util.*;
public class ShortestPathInUndirectedGraph {
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i= 0 ; i < n ; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] edge : edges ){
            int snode = edge[0];
            int dnode = edge[1];

            adjList.get(snode).add(dnode);
            adjList.get(dnode).add(snode);
        }

        int[] distance = new int[n];
        Arrays.fill(distance , Integer.MAX_VALUE);
        distance[src] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> a[1]-b[1]);

        queue.offer(new int[]{src , 0});



        while(!queue.isEmpty()){
            int node = queue.peek()[0];
            int value = queue.peek()[1];
            queue.poll();

            for(int adjNode : adjList.get(node)){
                if(distance[node] + 1 < distance[adjNode]){
                    distance[adjNode] = distance[node] + 1;
                    queue.offer(new int[]{adjNode , distance[adjNode]});
                }

            }
        }
        for(int i = 0 ; i < distance.length  ;i++){
            if(distance[i] == Integer.MAX_VALUE){
                distance[i] = -1;
            }
        }

        return distance;


    }
}
