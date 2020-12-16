package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] selfForward = new int[length];
        int[] selfBackward = new int[length];
        selfForward[length -1] = nums[length -1];
        for (int i = length -2; i >= 0; i--) {
            selfForward[i] = selfForward[i+1] * nums[i];
        }
        selfBackward[0] = nums[0];
        for (int i = 1; i < length; i++) {
            selfBackward[i] = selfBackward[i - 1] * nums[i];
        }
        int[] result = new int[length];
        for (int i = 1; i < length -1; i++) {
            result[i]=selfBackward[i-1]*selfForward[i+1];
        }
        result[0] = selfForward[1];
        result[length -1] = selfBackward[length -2];
        return result;
    }
}
