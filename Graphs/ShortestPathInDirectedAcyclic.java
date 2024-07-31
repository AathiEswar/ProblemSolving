package ProblemSolving.Graphs;
import java.util.*;
public class ShortestPathInDirectedAcyclic {
    class Own{
        public int[] shortestPath(int N,int M, int[][] edges) {
            //Code here
            List<List<int[]>> adjList = new ArrayList<>();

            for(int i = 0 ; i < N ; i++){
                adjList.add(new ArrayList<>());
            }

            for(int[] edge : edges){
                int start = edge[0];
                int end = edge[1];
                int weight = edge[2];

                adjList.get(start).add(new int[]{ end , weight });
            }

            int[] visited = new int[N];
            int[] distance = new int[N];
            Arrays.fill(distance , Integer.MAX_VALUE );

            PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> a[1]-b[1]);

            queue.offer(new int[]{0,0});

            while(!queue.isEmpty()){
                int node = queue.peek()[0];
                int dis = queue.peek()[1];
                queue.poll();

                for(int[] adjNode : adjList.get(node)){
                    int adj = adjNode[0];
                    int adjValue  = adjNode[1];

                    if(dis + adjValue < distance[adj]){
                        distance[adj] = dis+adjValue;
                        queue.offer(new int[]{adj , distance[adj]});
                    }
                }
            }

            for(int i = 0 ; i < distance.length ; i++){
                if ( distance[i] == Integer.MAX_VALUE){
                    distance[i] = -1;
                }
            }
            distance[0] = 0 ;

            return distance;


        }
    }
}

