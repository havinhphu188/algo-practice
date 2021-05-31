package leedcodeeasy;

import java.util.Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
//        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
