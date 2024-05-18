package ProblemSolving.array;

public class MaxAreaOfLongestDiagonal {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // diagonal = pythagorus theorem
        int lengthArr = dimensions.length;

        int maxDiagonal = 0;
        int maxArea = 0;


        for(int i=0;i<lengthArr;i++){
            int currentLength = dimensions[i][0] ;
            int currentWidth = dimensions[i][1] ;

            // no need to find sqrt coz heighest square will the highest sqrt
            int currentDiagonal = currentLength*currentLength + currentWidth * currentWidth  ;
            int currentArea =  currentLength * currentWidth ;

            // greater than maxDiagonal or ( equal to maxDiagonal and greater than maxArea )
            if(maxDiagonal < currentDiagonal || (maxDiagonal == currentDiagonal && maxArea < currentArea)){
                maxDiagonal = currentDiagonal;
                maxArea = currentArea;
            }

        }

        return maxArea;
    }
}
