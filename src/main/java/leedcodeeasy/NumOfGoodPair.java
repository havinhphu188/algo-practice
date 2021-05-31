package leedcodeeasy;

import java.util.Arrays;

public class NumOfGoodPair {
    public int numIdenticalPairs(int[] nums) {
//        System.out.println("nums = " + Arrays.toString(nums));
        int pair = 0;
        int[] map = new int[101];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]]++;
        }

        for (int i = 0; i < map.length ; i++) {
            pair += map[i]*(map[i]-1)/2;
        }

        return pair;
    }
}
