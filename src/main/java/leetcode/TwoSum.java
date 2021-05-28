package leetcode;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    Gson gson = new Gson();
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> listIndex = map.getOrDefault(nums[i], new ArrayList<>());
            listIndex.add(i);
            map.put(nums[i], listIndex);
        }

        if (target % 2 == 0) {
            if (map.containsKey(target/2)){
                List<Integer> listIndex = map.get(target/2);
                if (listIndex.size() >= 2) return new int[]{listIndex.get(0),listIndex.get(1)};
            }
        }

        for (Integer key : map.keySet()) {
            if (map.containsKey(target-key)){
//                System.out.println("key = " + key);
//                System.out.println("key - opposite = " + (target - key));
                return new int[]{map.get(key).get(0), map.get(target - key).get(0)};
            }
        }
        return new int[]{0,1};
    }
}
