package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame3Test {
    @Test
    public void testCase1() {
        int[] input = {4,2,3,0,3,1,2};
        JumpGame3 sol = new JumpGame3();
        assertEquals(true, sol.canReach(input, 5));
    }

    @Test
    public void testCase2() {
        int[] input = {4,2,3,0,3,1,2};
        JumpGame3 sol = new JumpGame3();
        assertEquals(true, sol.canReach(input, 0));
    }

    @Test
    public void testCase3() {
        int[] input = {3,0,2,1,2};
        JumpGame3 sol = new JumpGame3();
        assertEquals(false, sol.canReach(input, 2));
    }

    @Test
    public void testCase4() {
        int[] input = {0,1};
        JumpGame3 sol = new JumpGame3();
        assertEquals(true, sol.canReach(input, 1));
    }
    @Test
    public void testCase5() {
        int[] input = {0,1};
        JumpGame3 sol = new JumpGame3();
        assertEquals(true, sol.canReach(input, 1));
    }
    @Test
    public void testCase6() {
        int[] input = {0,0};
        JumpGame3 sol = new JumpGame3();
        assertEquals(true, sol.canReach(input, 1));
    }

    @Test
    public void testCase7() {
        int[] input = {0,2};
        JumpGame3 sol = new JumpGame3();
        assertEquals(false, sol.canReach(input, 1));
    }
}