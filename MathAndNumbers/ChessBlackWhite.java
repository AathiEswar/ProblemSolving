package ProblemSolving.MathAndNumbers;

public class ChessBlackWhite {
    public boolean squareIsWhite(String cor) {
        int dig1 = cor.charAt(0) - 'b';
        int dig2 = cor.charAt(1) - '0';

        if(dig1 % 2== 0 && dig2 % 2 == 0 || dig1 % 2 != 0 && dig2 % 2 != 0){
            return false;
        }
        else{
            return true;
        }
    }
}
