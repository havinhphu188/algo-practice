package leetcode;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/remove-duplicate-letters
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            count[c - 'a']++;
        }

        for (char c : arr) {
            count[c - 'a']--;
            if (visited[c - 'a']) continue;
            while ((!stack.empty())&&(c < stack.peek())&&(count[stack.peek() - 'a'] > 0)) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
