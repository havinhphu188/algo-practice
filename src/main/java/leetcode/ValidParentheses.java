package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    //O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> counterPart = new HashMap<>();
        counterPart.put('(', ')');
        counterPart.put('[', ']');
        counterPart.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == '(')||(c =='[')||(c =='{')){
                stack.push(c);
            }else{
                if (stack.empty()) return false;
                if (c != counterPart.get(stack.peek())){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
