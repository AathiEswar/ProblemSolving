package ProblemSolving.array;

public class WinnerOfBowlingGame {
    class Solution {
        public int isWinner(int[] player1, int[] player2) {
            int sumOfPlayer1 = sumOfWinner(player1);
            int sumOfPlayer2 = sumOfWinner(player2);

            if(sumOfPlayer1 > sumOfPlayer2){
                return 1;
            }
            if(sumOfPlayer1 == sumOfPlayer2){
                return 0;
            }
            return 2;
        }

        public int sumOfWinner(int[] player){

            int sum = 0;

            for(int i = 0;i<player.length;i=i+1){
                if(i==1 && (player[i-1] == 10 )){
                    sum = sum + 2 * player[i];
                }
                else if(i>1 && (player[i-1] == 10 || player[i-2] == 10)){
                    sum = sum +  2 * player[i];
                }
                else{
                    sum= sum +  player[i];
                }

            }
            return sum;
        }
    }
}
