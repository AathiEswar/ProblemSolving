package ProblemSolving.Stacks;

import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String dig : tokens){
            if(isOp(dig)){
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch(dig){
                    case "+" -> stack.push(num2+num1);
                    case "-" -> stack.push(num2-num1);
                    case "/" -> stack.push(num2/num1);
                    case "*" -> stack.push(num2*num1);
                }
            }
            else{
                stack.push(Integer.parseInt(dig));
            }
        }
        return stack.pop();
    }

    public boolean isOp(String s){
        return List.of("+"  , "-" , "/" ,"*").contains(s);
    }
}
