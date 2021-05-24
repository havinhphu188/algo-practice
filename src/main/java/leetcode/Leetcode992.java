package leetcode;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;

//Subarrays with K Different Integers
//https://leetcode.com/problems/subarrays-with-k-different-integers/
public class Leetcode992 {

    public int subarraysWithKDistinct(int[] nums, int k) {
        int totalSubArray = 0;
        for (int windowSize = k; windowSize <= nums.length; windowSize++) {
            HashMap<Integer, Integer> windowDic = new HashMap<>();
            for (int i = 0; i < windowSize; i++) { //init windowDic
                windowDic.put(nums[i], windowDic.getOrDefault(nums[i], 0) + 1);
            }
            if (windowDic.size() == k) totalSubArray++;
            for (int i = 1; i < nums.length - windowSize + 1; i++) {
                windowDic.put(nums[i - 1], windowDic.getOrDefault(nums[i - 1], 0) - 1);
                if (windowDic.get(nums[i - 1]) == 0) {
                    windowDic.remove(nums[i - 1]);
                }
                windowDic.put(nums[i + windowSize - 1], windowDic.getOrDefault(nums[i + windowSize - 1], 0) + 1);
                if (windowDic.size() == k) totalSubArray++;
            }
        }

        return totalSubArray;
    }

}
