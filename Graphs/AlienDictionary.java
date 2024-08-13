package ProblemSolving.Graphs;
import java.util.*;
public class AlienDictionary {

    public List<Integer> topoSort(List<List<Integer>> adjList , int V){

        int[] indegree = new int[V];

        for(int i = 0 ; i<V ; i++){
            for(int adjNode : adjList.get(i)){
                indegree[adjNode]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);

            for(int adjNode : adjList.get(node)){
                indegree[node]--;
                if(indegree[adjNode] == 0){
                    queue.offer(adjNode);
                }
            }
        }

        return result ;

    }


    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0 ; i<K ; i++){
            adjList.add(new ArrayList<>());
        }


        for(int i = 0 ; i< N-1; i++){
            String s1 = dict[i];
            String s2 = dict[i+1];

            int len = Math.min(s1.length() , s2.length());

            for(int j = 0 ; j< len ; j++){
                if(s1.charAt(j) != s2.charAt(j)){
                    adjList.get(s1.charAt(j)-'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }


        List<Integer> topo = topoSort(adjList , K );


        String ans = "";
        for (int it : topo) {
            ans = ans + (char)(it + (int)('a'));
            System.out.println(ans);
        }

        return ans;


    }
}
