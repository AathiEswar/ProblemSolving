package ProblemSolving.Graphs;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        // initialize
        int rowLen = grid.length ;
        int colLen = grid[0].length ;

        // dfs the border islands only
        for(int i = 0 ; i<rowLen ; i++){
            for(int j = 0 ; j<colLen ; j++){
                if(i == 0 || j == 0 || i == rowLen-1 || j == colLen-1){
                    if(grid[i][j] == 1){
                        dfs(i , j , grid);
                    }
                }
            }
        }
        // count the rem island
        int count = 0;
        for(int i = 0 ; i<rowLen ; i++){
            for(int j = 0 ; j<colLen ; j++){
                count+= grid[i][j];
            }
        }

        // return count
        return count;
    }

    public void dfs(int x , int y , int[][] grid ){
        if (x < 0 || x >= grid.length || y < 0 || y>= grid[0].length ) {
            return;
        }
        if (grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 0;

        dfs(x + 1, y, grid);
        dfs(x - 1, y, grid);
        dfs(x, y + 1, grid);
        dfs(x, y - 1, grid);

    }
}
