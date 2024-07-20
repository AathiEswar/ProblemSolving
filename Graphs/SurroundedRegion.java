package ProblemSolving.Graphs;

public class SurroundedRegion {
    public void solve(char[][] board) {
        // initialize
        int rowLen = board .length;
        int colLen = board[0].length ;

        // if the border has O dfs from there and change the regions to Y temporarily
        for(int i = 0 ; i< rowLen ; i++){
            for(int j = 0 ; j < colLen ;j++){
                if(i == 0 || j == 0 || i == rowLen-1 || j == colLen - 1 ){
                    if(board[i][j] == 'O'){
                        dfs(board , i , j);
                    }
                }
            }
        }

        // convert all still-O to X has they as surrounded
        for(int i = 0 ; i< rowLen ; i++){
            for(int j = 0 ; j < colLen ;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        // convert the Y to O as they cant be converted
        for(int i = 0 ; i< rowLen ; i++){
            for(int j = 0 ; j < colLen ;j++){
                if(board[i][j] == 'Y'){
                    board[i][j] = 'O';
                }
            }
        }
    }


    public void dfs(char[][] board , int row , int col ){

        // initialize
        int rowLen = board.length ;
        int colLen = board[0].length ;

        // change the current board region to Y temporarily
        board[row][col] = 'Y';
        int[][] directions = {
                {1 , 0},
                {-1 , 0},
                {0 , 1},
                {0 , -1}
        };

        // the four directions
        for(int[] dir : directions){
            int x = row + dir[0];
            int y= col + dir[1];

        // if the region is inside the grid then dfs it
            if(x>0 && y > 0 && x < rowLen - 1 && y < colLen - 1 && board[x][y] == 'O'){
                dfs(board , x , y);
            }
        }
    }
}
