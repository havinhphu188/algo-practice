package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/k-diff-pairs-in-an-array/
//532. K-diff Pairs in an Array
public class KDiffPair {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        while (left < nums.length - 1) {
            while (((right < nums.length - 1)&&(nums[right] < nums[left] + k))||(right <= left)){
                right++;
            }
//            System.out.println("left = " + left);
//            System.out.println("right = " + right);
            if ((nums[right]==nums[left]+k)) count++;
            do {
                left++;
            }while ((nums[left-1] == nums[left])&&(left < nums.length - 1));
        }

        return count;
    }
}
