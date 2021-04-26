package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock3Test {
    BestTimeToBuyAndSellStock3 solution = new BestTimeToBuyAndSellStock3();

    @Test
    public void testCase1() {
        int[] prices = {3,3,5,0,0,3,1,4};
        assertEquals(6, solution.maxProfit(prices));
    }

    @Test
    public void testCase2() {
        int[] prices = {1,2,3,4,5};
        assertEquals(4, solution.maxProfit(prices));
    }

    @Test
    public void testCase3() {
        int[] prices = {7,6,4,3,1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    public void testCase4() {
        int[] prices = {1};
        assertEquals(0, solution.maxProfit(prices));
    }
}