package ProblemSolving.Graphs;

public class NumberOfIsland {
    class ownSolution {
        public int numIslands(char[][] grid) {
            // own solution
            int rowLen = grid.length ;
            int colLen = grid[0].length ;
            int[][] visited = new int[rowLen][colLen];

            int count = 0 ;

            for(int i = 0 ; i<rowLen ; i++){
                for(int j = 0 ; j<colLen ; j++){
                    if(visited[i][j] != 1 && grid[i][j] == '1'){
                        count++;
                        customDFS(grid , visited , i , j , rowLen , colLen);
                    }
                }
            }

            return count ;
        }

        public void customDFS(char[][] grid , int[][] visited , int row ,int col , int rowLen , int colLen ){
            if(row >= rowLen || col >= colLen || row<0 || col < 0) {
                return ;
            }
            if(visited[row][col] == 1){
                return ;
            }
            if(grid[row][col] == '1'){
                visited[row][col] = 1;
                customDFS(grid , visited , row+1 , col , rowLen , colLen);
                customDFS(grid , visited , row , col+1 , rowLen , colLen);
                customDFS(grid , visited , row , col-1 , rowLen , colLen);
                customDFS(grid , visited , row-1 , col , rowLen , colLen);
            }

        }
    }

    class Optimized{
        public int numIslands(char[][] grid) {
            // optimized
            int rowLen = grid.length ;
            int colLen = grid[0].length ;
            int count = 0 ;

            for(int i = 0 ; i<rowLen ; i++){
                for(int j = 0 ; j<colLen ; j++){
                    if(grid[i][j] == '1'){
                        count++;
                        customDFS(grid ,i , j);
                    }
                }
            }
            return count ;
        }

        public void customDFS(char[][] grid, int row ,int col){
            if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
                return ;
            }
            if(grid[row][col] == '0'){
                return ;
            }

            grid[row][col] = '0';
            customDFS(grid ,row+1 , col);
            customDFS(grid , row , col+1);
            customDFS(grid , row , col-1);
            customDFS(grid , row-1 , col);

        }
    }
}
