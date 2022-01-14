package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//560. Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {
        public int subarraySum(int[] nums, int k) {
    //        System.out.println("nums = " + Arrays.toString(nums));
    //        System.out.println("k = " + k);
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int count = 0;
            map.put(0, 1);
            for (int num : nums) {
                sum += num;
                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
}
