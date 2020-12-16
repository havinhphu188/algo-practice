package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] R = new int[length];
        int[] L = new int[length];
        int[] result = new int[length];

        L[0] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = L[i - 1] * nums[i-1];
        }

        R[length-1] = 1;
        for (int i = length-2; i >= 0 ; i--) {
            R[i] = R[i + 1] * nums[i+1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = R[i] * L[i];
        }
        return result;
    }
}
