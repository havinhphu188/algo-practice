package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDiffPairTest {
    @Test
    public void testCase1() {
        KDiffPair sol = new KDiffPair();
        int[] input = {3,1,4,1,5};
        assertEquals(2, sol.findPairs(input, 2));
    }

    @Test
    public void testCase2() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,2,3,4,5};
        assertEquals(4, sol.findPairs(input, 1));
    }

    @Test
    public void testCase3() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,1,3};
        assertEquals(1, sol.findPairs(input, 2));
    }

    @Test
    public void testCase4() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,1,4};
        assertEquals(0, sol.findPairs(input, 2));
    }

    @Test
    public void testCase5() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,1,2};
        assertEquals(0, sol.findPairs(input, 2));
    }

    @Test
    public void testCase6() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,2,2};
        assertEquals(1, sol.findPairs(input, 1));
    }

    @Test
    public void testCase7() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1};
        assertEquals(0, sol.findPairs(input, 1));
    }

    @Test
    public void testCase8() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1};
        assertEquals(1, sol.findPairs(input, 0));
    }

    @Test
    public void testCase9() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,3,1,5,4};
        assertEquals(1, sol.findPairs(input, 0));
    }

    @Test
    public void testCase10() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,2,4,4,3,3,0,9,2,3};
        assertEquals(2, sol.findPairs(input, 3));
    }

    @Test
    public void testCase11() {
        KDiffPair sol = new KDiffPair();
        int[] input = {-1,-2,-3};
        assertEquals(2, sol.findPairs(input, 1));
    }

    @Test
    public void testCase12() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,1,2,2,2};
        assertEquals(1, sol.findPairs(input, 1));
    }

    @Test
    public void testCase13() {
        KDiffPair sol = new KDiffPair();
        int[] input = {-1,-2,-1,-3,0,1};
        assertEquals(4, sol.findPairs(input, 1));
    }

    @Test
    public void testCase14() {
        KDiffPair sol = new KDiffPair();
        int[] input = {0,0,0};
        assertEquals(1, sol.findPairs(input, 0));
    }

    @Test
    public void testCase15() {
        KDiffPair sol = new KDiffPair();
        int[] input = {1,1,1,2,2};
        assertEquals(2, sol.findPairs(input, 0));
    }

}