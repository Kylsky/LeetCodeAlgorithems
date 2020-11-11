package valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//采用hashmap的形式存储数据并作匹配，本质上和用栈相同
//Runtime: 1 ms, faster than 98.82% of Java online submissions for Valid Parentheses.
//        Memory Usage: 37.8 MB, less than 28.01% of Java online submissions for Valid Parentheses.
public class Optimize {
    public boolean isValid(String s){
        Map<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                stack.push(map.get(c));
            }else if (stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
