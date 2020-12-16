package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    @Test
    public void testCase1() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int ouput = maximumSubarray.maxSubArray(input);
        assertEquals(6, ouput);
    }

}