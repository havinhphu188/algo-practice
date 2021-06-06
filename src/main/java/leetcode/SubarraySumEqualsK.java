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

        int[] right = new int[nums.length];
        int sumRight = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            sumRight += nums[i];
            right[i-1] = sumRight;
        }
        int remainingSum = totalSum - k;
        int result = 0;

        for (int i = 0; i < left.length; i++) {
            for (int j = i; j < right.length; j++) {
                if (right[j]+left[i]==remainingSum){
                    result++;
                }
            }
        }

//        System.out.println("left = " + Arrays.toString(left));
//        System.out.println("right = " + Arrays.toString(right));
//        System.out.println("remainingSum = " + remainingSum);
//        System.out.println("result = " + result);
//        System.out.println("totalSum = " + totalSum);
        return result;
    }
}
