package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testCase1() {
        int[] input = new int[]{2,7,11,15};
        TwoSum sol = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, sol.twoSum(input,9));
    }

    @Test
    public void testCase2() {
        int[] input = new int[]{3,2,4};
        TwoSum sol = new TwoSum();
        assertArrayEquals(new int[]{1,2}, sol.twoSum(input,6));
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{3,3};
        TwoSum sol = new TwoSum();
        assertArrayEquals(new int[]{0,1}, sol.twoSum(input,6));
    }

    @Test
    public void testCase4() {
        int[] input = new int[]{3,3,4,4};
        TwoSum sol = new TwoSum();
        assertArrayEquals(new int[]{0,2}, sol.twoSum(input,7));
    }
    @Test
    public void testCase5() {
        int[] input = new int[]{3,3,4,4};
        TwoSum sol = new TwoSum();
        assertArrayEquals(new int[]{2,3}, sol.twoSum(input,8));
    }
}