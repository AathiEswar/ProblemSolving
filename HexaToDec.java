package ProblemSolving;

import java.util.Scanner;

class ConvertorHTD{
    private final String HEXA = "0123456789ABCDEF";
    private String hex ;
    private int dec=0;

    public void setHex(String hex){this.hex = hex;}
    public void displayValue(){System.out.println("The Decimal value:"+dec);}
    public void convertHexaToDec(){

        for (int i = hex.length()-1;i>=0; i--) {
            char ele = hex.toUpperCase().charAt(i);
            int val = HEXA.indexOf(ele);
            dec = dec+(int)Math.pow(16,hex.length()-i-1)*val;
        }

    }

}
class DoTheWholeWork extends ConvertorHTD{
        public void justDoTheWork(String hex){
            super.setHex(hex);
            super.convertHexaToDec();
            super.displayValue();
        }
}
public class HexaToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HexaDecimal:");
        String hex = sc.nextLine();
        DoTheWholeWork dtww = new DoTheWholeWork();
        dtww.justDoTheWork(hex);
    }

}
