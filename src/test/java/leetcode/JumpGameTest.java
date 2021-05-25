package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    @Test
    public void testCase1() {
        int[] input  = {2,3,1,1,4};
        JumpGame sol = new JumpGame();
        assertEquals(true, sol.canJump(input));
    }

    @Test
    public void testCase2() {
        int[] input  = {3,2,1,0,4};
        JumpGame sol = new JumpGame();
        assertEquals(false, sol.canJump(input));
    }

    @Test
    public void testCase3() {
        int[] input  = {0};
        JumpGame sol = new JumpGame();
        assertEquals(true, sol.canJump(input));
    }

    @Test
    public void testCase4() {
                ///     0 1 2 3 4 5 6 7
        int[] input  = {1,2,5,0,0,0,0,0,2,0,0,0,3,4};
        JumpGame sol = new JumpGame();
        assertEquals(false, sol.canJump(input));
    }

    @Test
    public void testCase5() {
        ///     0 1 2 3 4 5 6 7
        int[] input  = {3};
        JumpGame sol = new JumpGame();
        assertEquals(true, sol.canJump(input));
    }

    @Test
    public void testCase6() {
        ///     0 1 2 3 4 5 6 7
        int[] input  = {0,0};
        JumpGame sol = new JumpGame();
        assertEquals(false, sol.canJump(input));
    }
}