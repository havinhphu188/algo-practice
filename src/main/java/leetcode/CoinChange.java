package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/coin-change/
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j-coins[i]] >= 0){
                    dp[j]= dp[j] != -1? Math.min(dp[j-coins[i]] + 1, dp[j]): dp[j-coins[i]] + 1;
                }
            }
        }
        return dp[amount];
    }
}
