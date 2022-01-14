package leetcode;
//https://leetcode.com/problems/maximum-subarray/
//53. Maximum Subarray
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            }else{
                currentSum += nums[i];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
