package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Permutation2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = -10; i <= 10; i++) {
            counter.put(i, 0);
        }
        for (int i : nums) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
//        System.out.println("counter = " + counter);
        List<List<Integer>> result = new ArrayList<>();
//        System.out.println("nums = " + Arrays.toString(nums));
        backTracking(nums, counter, new ArrayList<>(), result);
//        System.out.println("result = " + result);
        return result;
    }

    public void backTracking(int[] nums, HashMap<Integer, Integer> counter, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
//            System.out.println("tempList = " + tempList);
            return;
        }
        for (Integer key : counter.keySet()) {
            if (counter.get(key) == 0) continue;
            tempList.add(key);
            counter.put(key, counter.get(key) - 1);
            backTracking(nums, counter, tempList, result);
            tempList.remove(tempList.size() - 1);
            counter.put(key, counter.get(key) + 1);
        }
    }
}
