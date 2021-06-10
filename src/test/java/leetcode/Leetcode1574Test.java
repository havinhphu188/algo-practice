package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode1574Test {
    @Test
    public void testCase1() {
        Leetcode1574 sol = new Leetcode1574();
        assertEquals(3, sol.findLengthOfShortestSubarray(new int[]{1,2,3,10,4,2,3,5}));
    }

    @Test
    public void testCase2() {
        Leetcode1574 sol = new Leetcode1574();
        assertEquals(3, sol.findLengthOfShortestSubarray(new int[]{5,6,7,8,9,2,3,4}));
    }

    @Test
    public void testCase3() {
        Leetcode1574 sol = new Leetcode1574();
        assertEquals(0, sol.findLengthOfShortestSubarray(new int[]{1,2,3}));
    }

}