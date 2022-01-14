package leetcode;

import java.util.Stack;

//1hour
//394. Decode String
//https://leetcode.com/problems/decode-string/
public class DecodeString {
    public String decodeString(String s) {
//        System.out.println("s = " + s);
        Stack<String> result = new Stack<>();
        Stack<Integer> count = new Stack<>();
        char[] sArr = s.toCharArray();
        result.push("");
        for (int i = 0; i < sArr.length; i++) {
            int num = 0;
            while ((sArr[i] >= '0') && (sArr[i] <= '9')) {
                num = num*10 + sArr[i] - '0';
                i++;
            }
            if (num > 0) count.push(num);
//            System.out.println("num = " + num);
            if (sArr[i] == '['){
                result.push("");
            }

            if ((sArr[i] >= 'a')&&(sArr[i] <= 'z')){
                String cur = result.pop();
                cur = cur.concat(String.valueOf(sArr[i]));
                result.push(cur);
            }
            if (sArr[i] == ']') {
                String top = result.pop();
                String cur = result.pop();
//                System.out.println("count.peek() = " + count.peek());
                for (int j = 0; j < count.peek(); j++) {
                    cur = cur.concat(top);
                }
                count.pop();
                result.push(cur);
            }
//            System.out.println("result = " + result);
        }
//        System.out.println("result = " + result.peek());
        return result.pop();
    }

}
