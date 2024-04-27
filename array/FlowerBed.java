package ProblemSolving.array;

public class FlowerBed {
    /*
    You have a long flowerbed in which some of the plots are planted, and some are not.
    However, flowers cannot be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's,
     where 0 means empty and 1 means not empty, and an integer n,
     return true if n new flowers can be planted in the flowerbed without
      violating the no-adjacent-flowers rule and false otherwise.
    */
    class SolutionOwn {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int i = 0;
            int count = 0;
            int len = flowerbed.length;
            while (i < len){
                if (flowerbed[i] == 1) {
                    i += 2;
                } else {
                    if ((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1) || flowerbed[i+1] == 0 ) {
                        count++;
                        i += 2;
                    } else i++;
                }
            }

            return count >= n;

        }
    }
    class SolutionBest {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int i = 0;
            int count = 0;
            int len = flowerbed.length;
            while (i < len){
                if (flowerbed[i] == 1) {
                    i += 2;
                } else {
                    if ((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1) || flowerbed[i+1] == 0 ) {
                        count++;
                        i += 2;
                    } else i++;
                }
            }

            return count >= n;

        }
    }
}
