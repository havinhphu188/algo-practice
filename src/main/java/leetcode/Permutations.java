package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/permutations/
//46. Permutations

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
//        System.out.println("nums = " + Arrays.toString(nums));
        backTracking(nums, new ArrayList<>(), result);
//        System.out.println("result = " + result);
        return result;
    }

    public void backTracking(int[] nums, List<Integer> tempList, List<List<Integer>> result){
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
//            System.out.println("tempList = " + tempList);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backTracking(nums,tempList,result);
            tempList.remove(tempList.size() - 1);
        }
    }
}
