package ProblemSolving.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInDirectedKahnsAlgo {
    public boolean isCycle(ArrayList<ArrayList<Integer>> adjList , int V){
        // find indegree
        int[] indegree = new int[V];

        for(int i = 0 ; i < V ; i++){
            for(int adjNode : adjList.get(i)){
                indegree[adjNode]++;
            }
        }

        // find components
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        int index = 0 ;

        while(!queue.isEmpty()){
            int node = queue.poll();
            // no need array just count the no of topo possible
            index++;

            for(int adjNode : adjList.get(node)){
                indegree[adjNode]--;
                if(indegree[adjNode] == 0){
                    queue.offer(adjNode);
                }
            }
        }

        return V == index ? false : true ;
    }
}
