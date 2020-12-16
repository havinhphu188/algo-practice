package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(
                    nums[i],
                    dp[i - 1] + nums[i] );
            if (dp[i]>maxSum)
                maxSum = dp[i];
        }
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("dp   = " + Arrays.toString(dp));
        return maxSum;
    }
}
