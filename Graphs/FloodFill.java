package ProblemSolving.Graphs;

public class FloodFill {
    class Own{
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            // own solution
            customDFS(image , sr , sc , color , image[sr][sc]);
            return image;
        }

        public void customDFS(int[][] image , int row , int col , int fillColor , int curColor){
            if(row < 0 || col < 0 || row >= image.length || col>= image[0].length ||
                    image[row][col] == fillColor || image[row][col] != curColor)
            {
                return ;
            }

            image[row][col] = fillColor ;
            customDFS(image , row+1 , col , fillColor , curColor);
            customDFS(image , row , col+1 , fillColor , curColor);
            customDFS(image , row-1 , col , fillColor , curColor);
            customDFS(image , row , col-1 , fillColor , curColor);
        }
    }
}
