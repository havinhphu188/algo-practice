package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode992Test {
    @Test
    public void testCase1() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1,2,1,2,3};
        assertEquals(7, sol.subarraysWithKDistinct(input,2));
    }

    @Test
    public void testCase2() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1,2,1,3,4};
        assertEquals(3, sol.subarraysWithKDistinct(input,3));
    }

    @Test
    public void testCase3() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1, 2, 1};
        assertEquals(3, sol.subarraysWithKDistinct(input,2));
    }

    @Test
    public void testCase4() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1, 1};
        assertEquals(0, sol.subarraysWithKDistinct(input,2));
    }

    @Test
    public void testCase5() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1, 2, 3};
        assertEquals(3, sol.subarraysWithKDistinct(input,1));
    }

    @Test
    public void testCase6() {
        Leetcode992 sol = new Leetcode992();
        int[] input = new int[]{1, 2, 3};
        assertEquals(1, sol.subarraysWithKDistinct(input,3));
    }
}