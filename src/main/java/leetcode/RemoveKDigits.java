package leetcode;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> chs = new Stack<Character>();
        int lenOut = num.length() - k;
        if (chs.empty()&& lenOut > 0) {
            chs.push(num.charAt(0));
        }
        for (int i = 1; i < num.length(); i++) {
            char c = num.charAt(i);

            int lenOfRemaining = num.length() - i;
            while (!chs.isEmpty() && chs.peek() > c && lenOfRemaining > lenOut - chs.size()) {
                chs.pop();
            }
            if (chs.size() < lenOut) {
                chs.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chs.size(); i++){
            sb.append(chs.get(i));
        }
        String out = sb.toString();
        out = out.replaceFirst("^0*", "");
        if (out.isEmpty()) {
            out = "0";
        }

        return out;
    }

    public static void main(String[] args) {
        RemoveKDigits sol = new RemoveKDigits();
        String out = sol.removeKdigits("112", 1);
        System.out.println(out);
    }
}
