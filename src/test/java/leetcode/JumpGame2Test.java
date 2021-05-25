package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame2Test {
    @Test
    public void testCase1() {
        int[] input = {2,3,1,1,4};
        JumpGame2 sol = new JumpGame2();
        assertEquals(2, sol.jump(input));
    }

    @Test
    public void testCase2() {
        //             0,1,2,3,4,5,6,7,8,9, 10, 11
        int[] input = {3,5,7,1,1,1,5,1,1,1, 1,  1};
        JumpGame2 sol = new JumpGame2();
        assertEquals(3, sol.jump(input));
    }

    @Test
    public void testCase3() {
        //             0,1,2,3,4,5,6,7,8,9, 10, 11
        int[] input = {0};
        JumpGame2 sol = new JumpGame2();
        assertEquals(0, sol.jump(input));
    }

    @Test
    public void testCase4() {
        //             0,1,2,3,4,5,6,7,8,9, 10, 11
        int[] input = {1,3};
        JumpGame2 sol = new JumpGame2();
        assertEquals(1, sol.jump(input));
    }

    @Test
    public void testCase5() {
        //             0,1,2,3,4,5,6,7,8,9, 10, 11
        int[] input = {3,5,1,1,1};
        JumpGame2 sol = new JumpGame2();
        assertEquals(2, sol.jump(input));
    }

    @Test
    public void testCase6() {
        //             0,1,2,3,4,5,6,7,8,9, 10, 11
        int[] input = {1};
        JumpGame2 sol = new JumpGame2();
        assertEquals(0, sol.jump(input));
    }
}