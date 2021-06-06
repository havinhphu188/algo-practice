package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int totalSum = Arrays.stream(nums).sum();
        int[] left = new int[nums.length];

        int sumLeft = 0;
        for (int i = 0, indexLeft = 1; i < nums.length - 1; i++, indexLeft++) {
            sumLeft += nums[i];
            left[indexLeft] = sumLeft;
        }

        Map<Integer, Integer> rightMap = new HashMap<>();
        rightMap.put(0, 1);
        int[] right = new int[nums.length];
        int sumRight = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            sumRight += nums[i];
            right[i-1] = sumRight;
            rightMap.put(sumRight, rightMap.getOrDefault(sumRight,0)+1);
        }
        int remainingSum = totalSum - k;
        int result = 0;

        for (int i = 0; i < left.length; i++) {
            if (rightMap.containsKey(remainingSum - left[i])){
                result += rightMap.get(remainingSum - left[i]);
            }
            rightMap.put(right[i], rightMap.get(right[i]) - 1);

        }

        return result;
    }
}
