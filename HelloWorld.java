package ProblemSolving;

public class HelloWorld {
    public static void main(String args[]) throws InterruptedException {
        String fin = "hello world";
        String res = "";
        for(int i=0;i<fin.length();i++) {
            if(Character.isWhitespace(fin.charAt(i))){
                res += " ";
                continue;}
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(res+ ch);
                Thread.sleep(200);
                if (ch == fin.charAt(i)) {
                    res += ch;
                    break;
                }
            }
        }
    }
}
