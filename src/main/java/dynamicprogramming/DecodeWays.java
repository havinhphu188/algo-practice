package dynamicprogramming;

import java.util.Arrays;

public class DecodeWays {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0'? 1: 0;
        for (int i = 1, dpIndex = 2; i < s.length(); i++, dpIndex++) {
            int concatWithPre = Integer.parseInt(s.substring(i-1,i+1));
            if (s.charAt(i) != '0') {
                dp[dpIndex] = dp[dpIndex - 1];
            }
            if ((concatWithPre <= 26)&&(concatWithPre >= 10)){
                dp[dpIndex] += dp[dpIndex - 2];
            }
        }
        return dp[s.length()];
    }
}
