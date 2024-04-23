package ProblemSolving.array;

import java.util.Arrays;

public class WidestVerticalArea {
    /* Given n points on a 2D plane where points[i] = [xi, yi],
     Return the widest vertical area between two points such that no points are
     inside the area.
     A vertical area is an area of fixed-width extending infinitely along the y-axis
     (i.e., infinite height). The widest vertical area is the one with the maximum width.  */
    public int widestVerticalArea(int[][] points) {
        int[] point = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            point[i] = points[i][0];
        }
        Arrays.sort(point);
        int maxWidth = 0;
        for (int i = 0; i < points.length - 1; i++) {
            maxWidth = Math.max(maxWidth, point[i + 1] - point[i]);
        }

        return maxWidth;
    }
}
