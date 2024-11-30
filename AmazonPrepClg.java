package ProblemSolving;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AmazonPrepClg {
    public static void main(String[] args) {
        int[][] height = {
                {3,2,1},
                {5,6,4},
                {9,8,7}
        };
        int start = 1;
        int end = 1;

        int[][] res = helperBFS(start , end , height);

        for(int[] resRow : res){
            System.out.println(Arrays.toString(resRow));
        }
    }
    public static int[][] helperBFS(int start , int end , int[][] height){
        int[][] res = new int[height.length][height.length];
        int[][] visited= new int[height.length][height.length];

        for(int[] resRow : res){
            Arrays.fill(resRow , -1);
        }

        Queue<int[]> queue = new LinkedList<>();
        res[start][end] = 0;
        queue.offer(new int[]{start , end});

        int depth = 0;
        int[][] dir = { {1,0} ,{-1,0} , {0,1} ,{0,-1} };
        while(!queue.isEmpty()){
            int snode = queue.peek()[0];
            int dnode = queue.peek()[1];
            queue.poll();
            visited[snode][dnode] = 1;
            for(int[] d : dir){
                int row = snode + d[0];
                int col = dnode + d[1];
                if(row >= 0 && col >= 0 && row < height.length && col <height.length){
                if(visited[row][col] != 1){
                    if(height[row][col] < height[start][end]){
                        visited[row][col] = 1;
                        res[row][col] = res[snode][dnode]+1;
                        queue.offer(new int[]{row , col});
                    }
                }
                }
            }
        }
        return res;
    }

    public static int[][] helperDFS(int start , int end , int[][] height){
        int[][] res = new int[height.length][height[0].length];

        for(int i = 0 ; i < height.length ;i++){
            Arrays.fill(res[i] , -1);
        }

        int[][] visited = new int[height.length][height.length];
        dfs(visited, height , start , end , res , start , end , 0);

        for(int[] resRow : res){
            System.out.println(Arrays.toString(resRow));
        }
        return res;
    }

    public static void dfs(int[][] visited , int[][] grid , int start , int end, int[][] res, int row, int col , int depth){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid.length || res[row][col] != -1 || visited[row][col] == 1
        ){
            return ;
        }
        visited[row][col] = 1;
        if(grid[start][end] > grid[row][col])
            res[row][col] = depth;

        dfs(visited,grid , start , end , res , row+1 , col , depth+1);
        dfs(visited ,grid , start , end , res , row-1 , col , depth+1);
        dfs(visited,grid , start , end , res , row , col+1 , depth+1);
        dfs(visited,grid , start , end , res , row , col-1 , depth+1);

    }

}
