package leetcode;

import leetcode.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    private static BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeAll
    public static void beforeAll() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void testCase1() {
        int[] input = new int[]{7,1,5,3,6,4};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(5, output);
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{7,6,4,3,1};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(0, output);
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{7,8,4,3,7};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(4, output);
    }

    @Test
    public void testCase4() {
        int[] input = new int[]{1,30,24,22,8,11,15};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(29, output);
    }

    @Test
    public void testCase5() {
        int[] input = new int[]{3,8,2,4};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(5, output);
    }



}