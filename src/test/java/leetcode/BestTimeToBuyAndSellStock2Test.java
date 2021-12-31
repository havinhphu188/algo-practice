package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock2Test {
    BestTimeToBuyAndSellStock2 solution = new BestTimeToBuyAndSellStock2();

    @Test
    void maxProfit() {
        int[] prices = {7,1,5,3,6,4};
        assertEquals(7, solution.maxProfit(prices));
    }

    @Test
    void maxProfit2() {
        int[] prices = {1,2,3,4,5};
        assertEquals(4, solution.maxProfit(prices));
    }
}