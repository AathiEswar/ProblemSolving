package ProblemSolving.Graphs;
import java.util.*;
public class NumberOfDistinctIsland {
    class OwnSolution{
        int countDistinctIslands(int[][] grid) {
            // Your Code here
            HashSet<String> set = new HashSet<>();

            for(int i = 0 ; i <grid.length ; i++){
                for(int j  = 0  ; j< grid[0].length ; j++){
                    if(grid[i][j] == 1){
                        set.add(dfs(grid , i , j , "B"));
                    }
                }
            }

            return set.size();
        }

        public static String dfs(int[][] grid , int row , int col , String iden){
            if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length ){
                return iden;
            }
            if(grid[row][col] == 0){
                return iden;
            }
            grid[row][col] = 0;
            String left = dfs(grid , row , col-1 , iden+"L");
            String right = dfs(grid , row , col+1 , iden+"R");
            String top = dfs(grid , row+1 , col , iden+"T");
            String bottom = dfs(grid , row-1 , col , iden+"B");

            return left + right + top + bottom ;
        }
    }

   
}
