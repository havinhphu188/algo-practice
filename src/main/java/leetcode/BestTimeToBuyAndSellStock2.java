package leetcode;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {

        int currentProfit=0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {;
            if ( prices[i] - minPrice > currentProfit){
                currentProfit =  prices[i] - minPrice;
            }else{
                minPrice = prices[i];
                maxProfit += currentProfit;
                currentProfit = 0;
            }
        }
        if (currentProfit >0){
            maxProfit += currentProfit;
        }
        return maxProfit;
    }

}
