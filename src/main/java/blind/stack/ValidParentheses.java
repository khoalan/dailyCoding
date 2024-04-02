package blind.stack;

//https://leetcode.com/problems/valid-parentheses/
//use hashMap

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for (char c:s.toCharArray()){
            if (st.isEmpty() && (c == ')' || c =='}' || c == ']')) {
                return false;
            }
            st.push(c);
            if (c == ')' || c =='}' || c == ']') st.pop();
            if (c == ')' && st.peek() == '('){
                st.pop();
            } else if (c == '}' && st.peek() == '{'){
                st.pop();
            } else if (c == ']' && st.peek() == '['){
                st.pop();
            } else if ((c == ')' || c =='}' || c == ']') && !st.isEmpty()) {
                return false;
            }

        }
        if (!st.isEmpty()) return false;
        return true;
    }

    public static boolean isValid2(String s) {

        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> myMap = new HashMap<>();
        myMap.put(')','(');
        myMap.put('}','{');
        myMap.put(']','[');
        for (char c:s.toCharArray()){
            if (myMap.containsKey(c)){
                if (!st.isEmpty() && myMap.get(c).equals(st.peek())){
                    st.pop();
                } else return false;
            }
            else st.push(c);
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid2("()[]"));
    }
}
