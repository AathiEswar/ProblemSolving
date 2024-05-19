package ProblemSolving.array;

public class ValidBoomerang {
    // collinearity is when the points in same line
    // use slope to find collinearity
    // three points are in the same line if their slopes are equal

    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int x2 = points[1][0];
        int x3 = points[2][0];
        int y1 = points[0][1];
        int y2 = points[1][1];
        int y3 = points[2][1];

        return ! ((x1 - x2)*(y1 - y3)  == (x1 - x3) * (y1 - y2) );

    }
}
