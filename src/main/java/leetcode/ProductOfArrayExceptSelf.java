package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] R = new int[length];
        R[length-1] = 1;
        for (int i = length-2; i >= 0 ; i--) {
            R[i] = R[i + 1] * nums[i+1];
        }
        int LeftProduct = 1;

        for (int i = 0; i < length; i++) {
            R[i] *= LeftProduct;
            LeftProduct *= nums[i];

        }
        return R;
    }
}
