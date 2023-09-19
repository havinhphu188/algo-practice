package leetcode2;

import com.google.gson.Gson;

import java.util.Stack;

class Solution {
    static Gson gson = new Gson();

    public String decodeString(String s) {
        Stack<Integer> stackNum = new Stack<>();
        Stack<String> stackString = new Stack<>();
        s = "1[" + s + "]";
        int i = 0;
        while (i < s.length()) {
            int num = 0;
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + s.charAt(i) - '0';
                i++;
            }
            if (num == 0) {
                num = 1;
            }
            stackNum.push(num);
            if (s.charAt(i) == '[') {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            sb.reverse();
            while (i < s.length() && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i));
                i++;
            }
            stackString.push(sb.toString());

            while (i < s.length() && (s.charAt(i) == ']')) {
                String clearingStr = stackString.pop();
                int currentNum = stackNum.isEmpty() ? 1 : stackNum.pop();
                String concatStr = "";
                for (int j = 0; j < currentNum; j++) {
                    concatStr += clearingStr;
                }
                String updateStr = stackString.isEmpty() ? "" : stackString.pop();
                updateStr += concatStr;
                stackString.push(updateStr);
                i++;
            }
        }
        StringBuilder sbResult = new StringBuilder();
        for (int j = 0; j < stackString.size(); j++) {
            for (int k = 0; k < stackNum.get(j); k++) {
                sbResult.append(stackString.get(j));
            }
        }
        System.out.println(gson.toJson(stackString));
        return sbResult.toString();
    }

}