package ProblemSolving.Graphs;
import java.util.*;
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        // normal BFS
        int rowLen = mat.length ;
        int colLen = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int[][] visited =new int[rowLen][colLen];
        int[][] grid = new int[rowLen][colLen];

        for(int i = 0 ; i< rowLen ; i++){
            for(int j = 0 ; j < colLen ; j++){
                // when 0 is faced add to queue and mark visited
                if(mat[i][j] == 0){
                    visited[i][j] = 1;
                    queue.offer(new int[]{i , j , 0});
                }
            }
        }

        int[][] directions = {
                {1 , 0},
                {-1 , 0},
                {0 , 1},
                {0 , -1},
        };

        while(!queue.isEmpty()){
            int row = queue.peek()[0];
            int col = queue.peek()[1];
            int dis = queue.peek()[2];

            queue.poll();
            // update distance to zero in the res grid matrix
            grid[row][col] = dis;

            // for iterating through the four directions
            for(int[] direction : directions ){
                int x = row + direction[0];
                int y = col + direction[1];

                // when a unvisited node is found after travelling any four of the directions
                if(x >=0 && y>=0 && x < rowLen && y < colLen && visited[x][y] != 1){
                    // mark as visited
                    visited[x][y] = 1;

                    // add to queue
                    queue.offer(new int[]{x , y , dis+1});
                }
            }
        }

        return grid;
    }
}
