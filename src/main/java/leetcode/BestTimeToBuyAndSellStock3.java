package leetcode;

public class BestTimeToBuyAndSellStock3 {
    public int maxProfit(int[] prices) {
        int[] maxProfitOnEnd = new int[prices.length];
        maxProfitOnEnd[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfitOnEnd[i] = Math.max(prices[i] - prices[i - 1],
                    prices[i] - prices[i - 1] + maxProfitOnEnd[i - 1]);
        }

        int[] maxProfitOnStart = new int[prices.length];
        maxProfitOnStart[prices.length - 1] = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            maxProfitOnStart[i] = Math.max(prices[i + 1] - prices[i],
                    prices[i + 1] - prices[i] + maxProfitOnStart[i + 1]);
        }

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (maxProfitOnEnd[i] + maxProfitOnStart[j] > maxProfit){
                    maxProfit = maxProfitOnEnd[i] + maxProfitOnStart[j];
                }
            }
        }

        return maxProfit;
    }
}
