package ProblemSolving.MathAndNumbers;
import java.util.*;
import java.lang.*;

class NotBinary extends Exception{
    public NotBinary(String msg)
    {
        super(msg);
    }
}
class Convertor {
    private int n;
    private int i ;
    private int dec ;
    Convertor() {
        this.i = 0;
        this.dec=0;
    }
    void set(int n) {
        this.n = n;
    }
    protected int Convention() throws NotBinary {
        while (n > 0) {
            int temp = n % 10;
            if(temp != 1 || temp != 0)
            {
                throw new NotBinary("This is not a Binary number");
            }
            dec += temp * ((int) Math.pow(2, i));

            n = n / 10;
            i++;
        }
        return dec;
    }
}

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Binary number:");
            int n = sc.nextInt();
            Convertor conv = new Convertor();
            conv.set(n);
            System.out.println(conv.Convention());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
