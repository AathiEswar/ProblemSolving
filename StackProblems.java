package ProblemSolving;

import java.util.Arrays;

public class StackProblems {
    public static void delimiter(String s){

        char[] stack = new char[s.length()];
        int top = -1;
        for(char ch : s.toCharArray()){
//            System.out.println(Arrays.toString(stack));
            if(ch == '(' ||ch == '{' ||ch == '['){
                stack[++top] = ch;
            }
            else if(Character.isLetterOrDigit(ch)){
                continue;
            }
            else{
                if(  top>=0 &&(   stack[top]=='('&&ch==')' ||
                        stack[top]=='{'&&ch=='}' ||
                        stack[top]=='['&&ch==']') )
                {
                    top--;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(top== -1?"Balanced" : "Not Balanced");

    }
    public static void revString(String s){
        char[] stack = new char[s.length()];
        int top = -1;
        String rev = "";
        for(char ch : s.toCharArray()){
            stack[++top] = ch;
        }
        while(top!=-1){
            rev+=stack[top--];
        }
        System.out.println(rev);
    }

    public static void revArray(int[] arr){
        int len = arr.length;
        int[] stack = new int[len];
        int top = -1;
        for(int i : arr){
            stack[++top] = i;
        }
        int idx = 0;
        while(top!= -1){
            arr[idx] = stack[top--];
            idx++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        String input = "Aathi Eswar ";
//        revString(input);
//        int[] arr = {1,2,3,4,5,6,7};
//        revArray(arr);
        delimiter("a[]{}dssdaf(sdfa{sdfa}})");
    }
}
