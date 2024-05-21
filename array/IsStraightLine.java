package ProblemSolving.array;

public class IsStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
            if(coordinates.length < 2 )return true;
            for(int i=2 ;i<coordinates.length ;i++){
                int x1 = coordinates[i-2][0];
                int x2 = coordinates[i-1][0];
                int x3 = coordinates[i][0];
                int y1 = coordinates[i-2][1];
                int y2 = coordinates[i-1][1];
                int y3 = coordinates[i][1];
                if( !isValid(x1 , x2 , x3 , y1 , y2 , y3)) return false;

            }
            return true;
    }
    public boolean isValid(int x1, int x2, int x3, int y1, int y2, int y3) {
        if (((y2 - y1) * (x3 - x2)) == ((y3 - y2) * (x2 - x1))) {
            return true;
        } else {
            return false;
        }
    }
}
