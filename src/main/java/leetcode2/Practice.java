package leetcode2;

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> ss = new Stack<StringBuilder>();
        Stack<Integer> si = new Stack<Integer>();
        int num = 0;
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= '0') && (c <= '9')) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                si.push(num);
                num = 0;
                ss.push(str);
                str = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = str;
                str = ss.pop();
                int count = si.pop();
                while (count > 0) {
                    str.append(temp);
                    count--;
                }
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}