package blind.stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluatePolishNaiton {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        Set<String> ope = new HashSet<>();
        ope.add("*");
        ope.add("/");
        ope.add("+");
        ope.add("-");
        for (String token:tokens){
            if (ope.contains(token)){
                int num2 = st.pop();
                int num1 = st.pop();
                int tempRes;
                if (token == "*") tempRes = num1*num2;
                else if (token == "/") tempRes = num1/num2;
                else if (token == "+") tempRes = num1+num2;
                else tempRes = num1-num2;
                st.push(tempRes);
            }
            else {
                st.push(Integer.parseInt(token));
            }
//            System.out.println(st);
        }
        return st.pop();
    }
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));

        int a=1;
        int b=2;
        if (a==b){
            System.out.println("a=b");
        } else {
            System.out.println("a!=b");
        }

        System.out.println("after if");
    }

}
