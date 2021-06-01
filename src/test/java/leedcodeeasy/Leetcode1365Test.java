package leedcodeeasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode1365Test {
    @Test
    public void testCase1() {
        Leetcode1365 sol = new Leetcode1365();
        assertArrayEquals(new int[]{4,0,1,1,3}, sol.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }

    @Test
    public void testCase2() {
        Leetcode1365 sol = new Leetcode1365();
        assertArrayEquals(new int[]{2,1,0,3}, sol.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    }

    @Test
    public void testCase3() {
        Leetcode1365 sol = new Leetcode1365();
        assertArrayEquals(new int[]{0,0,0,0}, sol.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }

}