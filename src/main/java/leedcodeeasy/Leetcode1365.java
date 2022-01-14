package leedcodeeasy;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
//1365. How Many Numbers Are Smaller Than the Current Number

public class Leetcode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] original = Arrays.copyOf(nums,nums.length);
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        int[] counter = new int[101];
        counter[nums[0]] = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]){
                counter[nums[i]] = i;
            }
        }
        for (int i = 0; i < original.length; i++) {
            result[i] = counter[original[i]];
        }
        return result;
    }
}
