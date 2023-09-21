package leetcode;

import java.util.Stack;

//1hour
//394. Decode String
//https://leetcode.com/problems/decode-string/
//Recommended Solution: https://leetcode.com/problems/decode-string/solutions/3385397/100-faster-java-solution-using-two-stack-efficient-solution/
public class DecodeString {
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
