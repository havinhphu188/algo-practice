package dynamicprogramming;
//https://leetcode.com/problems/house-robber
//198 House robber
public class HouseRobber {
    public int rob(int[] nums) {
        int[] result = new int[nums.length + 1];
        result[0] = 0;
        result[1] = nums[0];
        for (int i = 2; i < result.length; i++) {
            int numIndex = i - 1;
            result[i] = Math.max(result[i - 1], result[i-2]+ nums[numIndex]);
        }
        return result[result.length - 1];
    }
}
