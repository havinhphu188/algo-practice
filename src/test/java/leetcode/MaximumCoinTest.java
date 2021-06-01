package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumCoinTest {
    @Test
    public void testCase1() {
        MaximumCoin sol = new MaximumCoin();
        assertEquals(9, sol.maxCoins(new int[]{2,4,1,2,7,8}));
    }

}