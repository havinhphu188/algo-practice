package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    public void testCase1() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = new int[]{1,2,3,4};
        int[] output = new int[]{24,12,8,6};
        assertArrayEquals(output, productOfArrayExceptSelf.productExceptSelf(input));
    }
}