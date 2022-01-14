package leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
//123. Best Time to Buy and Sell Stock III
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
        int maxProfit1stTrans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (maxProfitOnEnd[i]>maxProfit1stTrans){
                maxProfit1stTrans = maxProfitOnEnd[i];
            }
            if (maxProfit < maxProfit1stTrans + maxProfitOnStart[i]) {
                maxProfit = maxProfit1stTrans + maxProfitOnStart[i];
            }
        }

        return maxProfit;
    }
}
