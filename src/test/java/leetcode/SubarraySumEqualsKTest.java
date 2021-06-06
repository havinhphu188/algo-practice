package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {
    @Test
    public void testCase1() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{1,1,1}, 2));
    }

    @Test
    public void testCase2() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void testCase3() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{1,2,3,3}, 6));
    }

    @Test
    public void testCase4() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(1, sol.subarraySum(new int[]{5}, 5));
    }

    @Test
    public void testCase5() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(3, sol.subarraySum(new int[]{5,5,5}, 5));
    }

    @Test
    public void testCase6() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(0, sol.subarraySum(new int[]{5,5,5}, 6));
    }

    @Test
    public void testCase7() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(0, sol.subarraySum(new int[]{5}, 6));
    }

    @Test
    public void testCase8() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(1, sol.subarraySum(new int[]{1,5,7,3}, 10));
    }

    @Test
    public void testCase9() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{1,5,7,3,7}, 10));
    }

    @Test
    public void testCase10() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{2,2,2,2}, 6));
    }

    @Test
    public void testCase11() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{2,2,3,2}, 5));
    }

    @Test
    public void testCase12() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(1, sol.subarraySum(new int[]{-1,-1,1}, 0));
    }

    @Test
    public void testCase13() {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        assertEquals(2, sol.subarraySum(new int[]{2,3,-2,3,1}, 4));
    }


}