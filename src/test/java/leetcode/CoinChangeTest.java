package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    public void testCase1() {
        CoinChange sol = new CoinChange();
        int[] coins = {1,2,5};
        assertEquals(3, sol.coinChange(coins,11));
    }

    @Test
    public void testCase2() {
        CoinChange sol = new CoinChange();
        int[] coins = {2};
        assertEquals(-1, sol.coinChange(coins,3));
    }

    @Test
    public void testCase3() {
        CoinChange sol = new CoinChange();
        int[] coins = {1};
        assertEquals(0, sol.coinChange(coins,0));
    }

    @Test
    public void testCase4() {
        CoinChange sol = new CoinChange();
        int[] coins = {1};
        assertEquals(1, sol.coinChange(coins,1));
    }

    @Test
    public void testCase5() {
        CoinChange sol = new CoinChange();
        int[] coins = {1};
        assertEquals(2, sol.coinChange(coins,2));
    }

    @Test
    public void testCase6() {
        CoinChange sol = new CoinChange();
        int[] coins = {186,419,83,408};
        assertEquals(20, sol.coinChange(coins,6249));
    }

    @Test
    public void testCase7() {
        CoinChange sol = new CoinChange();
        int[] coins = {2,3,4};
        assertEquals(2, sol.coinChange(coins,5));
    }
}