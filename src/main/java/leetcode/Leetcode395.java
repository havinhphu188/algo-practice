package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//  https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
public class Leetcode395 {
    public int longestSubstring(String s, int k) {
        Stack<String> stack = new Stack<>();
        stack.push(s);
        int maxLength = 0;
        while (!stack.empty()){
            Map<Character, Integer> map = new HashMap<>();
            String currentString = stack.pop();
            for (int i = 0; i < currentString.length(); i++) {
                char current = currentString.charAt(i);
                map.put(current, map.getOrDefault(current, 0) + 1);
            }
            StringBuilder devidedChild = new StringBuilder();
            boolean isCurrentStringValid = true;
            System.out.println("currentString = " + currentString);
            for (int i = 0; i < currentString.length(); i++) {
                char current = currentString.charAt(i);
                System.out.println("current = " + current);
                if (map.get(current) >= k){
                    devidedChild.append(current);
                }else{
                    isCurrentStringValid = false;
                    if (devidedChild.length() >= k ){
                        stack.push(devidedChild.toString());
                    }
                    devidedChild = new StringBuilder();
                }
            }

            if ((devidedChild.length() >= k )&&!isCurrentStringValid){
                stack.push(devidedChild.toString());
            }

            if (isCurrentStringValid){
                maxLength = Math.max(currentString.length(), maxLength);
            }
            System.out.println("isCurrentStringValid = " + isCurrentStringValid);
            System.out.println("------");
        }
        return maxLength;
    }
}
