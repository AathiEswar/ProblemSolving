package ProblemSolving.array;

public class FloodFill {
    public int[][] floodFill(int[][] image , int row , int col , int fillColor){
        int reqColor = image[row][col];

        int rowLast  = image.length-1;
        int colLast = image[0].length-1;

        if(reqColor != fillColor) {

            floodFillHelper(image , row , col ,fillColor , reqColor, rowLast , colLast);
        }

        return image;
    }

    public void  floodFillHelper(int[][] image ,int row ,int  col , int fillcolor ,int reqcolor , int rowLast , int colLast){
        if(row < 0 || col < 0 || row> rowLast || col > colLast || image[row][col] != reqcolor) return ;

        image[row][col] = fillcolor;
        floodFillHelper(image , row-1 , col , fillcolor , reqcolor , rowLast , colLast);
        floodFillHelper(image , row+1 , col , fillcolor , reqcolor , rowLast , colLast);
        floodFillHelper(image , row , col-1 , fillcolor , reqcolor , rowLast , colLast);
        floodFillHelper(image , row+1, col+1 , fillcolor , reqcolor , rowLast , colLast);
    }
}
