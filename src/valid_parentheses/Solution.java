package valid_parentheses;


import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//No.20 valid-parentheses
//Runtime: 2 ms, faster than 33.84% of Java online submissions for Valid Parentheses.
//        Memory Usage: 39.5 MB, less than 5.79% of Java online submissions for Valid Parentheses.
//考虑速度不够的原因在于字符串的toCharArray消耗了性能，修改后代码如下，性能如下
//Runtime: 1 ms, faster than 98.82% of Java online submissions for Valid Parentheses.
//        Memory Usage: 37.1 MB, less than 91.14% of Java online submissions for Valid Parentheses.
public class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        boolean b = solution.isValid("()");
//        System.out.println(solution.stack);
//        System.out.println(b);
//    }

    Stack<Character> stack = new Stack();

    public boolean isValid(String s) {
        for (int i=0;i<s.length();i++) {
            checkQueue(s.charAt(i));
        }
        return stack.isEmpty();
    }

    private void checkQueue(char c) {
        if (stack.empty()){
            stack.add(c);
            return;
        }
        if (match(stack.peek(), c)){
            stack.pop();
        }else {
            stack.add(c);
        }
    }

    private boolean match(Character s1,Character s2){
        if (s1=='}' || s1==']'||s1==')'){
            return false;
        }
        if (s1=='('){
            return s2==')';
        }
        if (s1=='['){
            return s2==']';
        }
        if (s1=='{'){
            return s2=='}';
        }
        return false;
    }
}
